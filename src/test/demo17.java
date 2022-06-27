package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//电话号码的字母组合
public class demo17 {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return list;
        }
        Map<Character,String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backTrack(list, digits, map, 0, new StringBuilder());
        return list;
    }
    public void backTrack(List<String> list,String digits,Map<Character, String> map, int index, StringBuilder sb){
        if(sb.length()== digits.length()){
            list.add(sb.toString());
            return;
        }
        String value = map.get(digits.charAt(index));
        for(int i = 0;i<value.length();i++){
            backTrack(list,digits,map,index+1,sb.append(value.charAt(i)));
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
