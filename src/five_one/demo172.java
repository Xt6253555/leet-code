package five_one;
//阶乘后的零
public class demo172 {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(13));
    }
    public static int trailingZeroes(int n) {
        int sum = 0;
        while (n>0){
            sum+=n/5;
            n=n/5;
        }
        return sum;
    }
}
