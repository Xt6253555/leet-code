package five_one;

import java.util.ArrayList;
import java.util.List;
//为运算表达式设计优先级
public class demo241 {
    public static void main(String[] args) {
        String a= "abc";
        System.out.println(a.substring(0,0));
        System.out.println(a.substring(0));
    }
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if(c=='+'||c=='-'||c=='*'){
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i+1));
                for (Integer l : left) {
                    for (Integer r : right) {
                        if(c=='+'){
                            list.add(l+r);
                        }else if(c=='-'){
                            list.add(l-r);
                        }else {
                            list.add(l*r);
                        }
                    }
                }
            }
        }
        if(list.isEmpty()){
            list.add(Integer.valueOf(expression));
        }
        return list;
    }
}
