package one_one;

import java.util.HashMap;

//最小覆盖子串（滑动窗口）
public class demo76 {
    public static String minWindow(String s, String t) {
        int left = 0,right = 0;
        int valid=0;
        int start = 0;
        int len = Integer.MAX_VALUE;
        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            need.put(t.charAt(i),need.getOrDefault(t.charAt(i),0)+1);
        }
        while (right<s.length()){
            char c = s.charAt(right);
            right++;
            if(need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if(window.get(c).equals(need.get(c))){
                    valid++;
                }
            }
            //如果 valid 和 need.size 的⼤⼩相同
            //则说明窗 ⼝已满⾜条件，已经完全覆盖了串 T
            while (valid==need.size()){
                // 在这⾥更新最⼩覆盖⼦串
                if(right-left<len){
                    start = left;
                    len = right-left;
                }
                // d 是将移出窗⼝的字符
                char d = s.charAt(left);
                // 左移窗⼝
                left++;
                if(need.containsKey(d)){
                    if(window.get(d).equals(need.get(d)))
                        valid--;
                    window.put(d,window.getOrDefault(d,0)-1);
                }
            }
        }
        return len==Integer.MAX_VALUE?"":
                s.substring(start,len+start);
    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s,t));
    }
}
