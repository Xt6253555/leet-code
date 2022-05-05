package test;

import java.util.HashMap;

public class demo3 {
    public static void main(String[] args) {
        int pwwkew = lengthOfLongestSubstring("pwwkew");
        System.out.println(pwwkew);
    }
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        int right = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right>s.length()){
            char c = s.charAt(right);
            right++;
            map.put(c,map.getOrDefault(c,0)+1);
            while (map.get(c)>1){
                char d = s.charAt(left);
                left++;
                map.put(d,map.getOrDefault(d,0)-1);
            }
            max=Math.max(max,right-left);
        }
        return max;
    }
}
