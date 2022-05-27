package test;

import java.util.Stack;

public class demo921 {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("()))(("));
    }
    public static int minAddToMakeValid(String s) {
        int l = 0;
        int r = 0;
        for (char c : s.toCharArray()) {
            if(c=='('){
                l++;
            }else if(c==')'){
                if(l>0){
                    l--;
                }else {
                    r++;
                }
            }
        }
        return l+r;
    }
}
