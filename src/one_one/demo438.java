package one_one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//找到字符串中所有的字母异位词(滑动窗口)
public class demo438 {
    public static List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        int right = 0;
        int valid = 0;
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for (char c : p.toCharArray()) {
            need.put(c,need.getOrDefault(c,0)+1);
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
            //输入: s = "cbaebabacd", p = "abc"
            //输出: [0,6]
            while (right-left>=p.length()){
                if(valid==need.size())
                    list.add(left);
                char d = s.charAt(left);
                left++;
                if(need.containsKey(d)){
                    if(need.get(d).equals(window.get(d))){
                        valid--;
                    }
                    window.put(d,window.getOrDefault(d,0)-1);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("abab","ab"));
    }
}
