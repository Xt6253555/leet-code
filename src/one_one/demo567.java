package one_one;

import java.util.HashMap;

//字符串的排列(滑动窗口)
public class demo567 {
    //输入：s1= "ab" s2 = "eidboaoo"
    //输出：false
    //输入：s1 = "ab" s2 = "eidbaooo"
    //输出：true
    public static boolean checkInclusion(String s1, String s2) {
        int left = 0,right=0;
        int valid = 0;
        int start = 0;
        int len = Integer.MAX_VALUE;
        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            need.put(s1.charAt(i), need.getOrDefault(s1.charAt(i),0)+1);
        }
        while (right<s2.length()){
            char c = s2.charAt(right);
            right++;
            if (need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if(window.get(c).equals(need.get(c))){
                    valid++;
                }
            }
            while(right-left>=s1.length()){
//                if(right-left<len){
//                    start = left;
//                    len = right-left;
//                }
//                String str = s2.substring(start, start + len);
//                if(s1.length()==str.length()&&diff(s1,str)){
//                    return true;
//                }
                if(valid==need.size())return true;
                char d = s2.charAt(left);
                left++;
                if(need.containsKey(d)){
                    if(need.get(d).equals(window.get(d)))
                        valid--;
                    window.put(d,window.getOrDefault(d,0)-1);
                }
            }
        }
        return false;
    }
    public static boolean diff(String s2 ,String s1){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        for (char c : s2.toCharArray()) {
            if(map.containsKey(c)){
                map.put(c,map.getOrDefault(c,0)-1);
            }
        }
        for (Integer value : map.values()) {
            if(!value.equals(0))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab","eidboaoo"));
        System.out.println(checkInclusion("ab","eidbaooo"));
    }
}
