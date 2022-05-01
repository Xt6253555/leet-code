package five_one;

public class test {
    public static void main(String[] args) {
        String a = "10";
        String b = "11";
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        int s1 = Integer.parseInt(a, 2);
        int s2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(Integer.parseInt(a)+Integer.parseInt(b));
    }
}
