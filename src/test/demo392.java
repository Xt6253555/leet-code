package test;

public class demo392 {
    public static void main(String[] args) {
        boolean subsequence = isSubsequence("b", "abc");
        System.out.println(subsequence);
    }
    public static boolean isSubsequence(String s, String t) {
        int j=0;
        for (int i = 0; i < t.length(); i++) {
            if(t.charAt(i)==s.charAt(j)){
                j++;
            }
            if(j==s.length())return true;
        }
        return false;
    }
}
