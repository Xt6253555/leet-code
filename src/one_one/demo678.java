package one_one;

//有效的括号字符串
public class demo678 {
    public static void main(String[] args) {
        String s = "(*()";
        System.out.println(check(s));
    }
    public static boolean check(String s){
        int l = 0; int r = 0;
        for(char it : s.toCharArray()) {
            if(it == '(') {
                l++;
                r++;
            } else if(it == ')') {
                l = Math.max(l - 1,0);
                r--;
                if(r < 0) return false;
            } else {
                l = Math.max(l - 1, 0);
                r++;
            };
        }
        return l == 0;
    }
}
