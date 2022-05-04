package one_one;

import java.util.HashMap;

//最长无重复子串(滑动窗口)
public class demo3 {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right<s.length()){
            char c = s.charAt(right);
            right++;
            map.put(c,map.getOrDefault(c,0)+1);
            while (map.get(c)>1){
                char d = s.charAt(left);
                left++;
                map.put(d,map.getOrDefault(d,0)-1);
            }
            res = Math.max(res, right - left);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

}
