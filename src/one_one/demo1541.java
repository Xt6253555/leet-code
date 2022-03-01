package one_one;

//平衡括号字符串的最少插入次数
public class demo1541 {
    // 输入：s = "))())("
    //输出：3
    public static void main(String[] args) {
        System.out.println(minInsertions(")("));
    }
    public static int minInsertions(String s) {
        int res = 0, need = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                need += 2;
                if (need % 2 == 1) {
                    res++;
                    need--;
                }
            }

            if (c == ')') {
                need--;
                if (need == -1) {
                    res++;
                    need = 1;
                }
            }
        }
        return res+need;
    }
}
