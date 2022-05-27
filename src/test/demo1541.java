package test;

public class demo1541 {
//  )( 4
    public int minInsertions(String s) {
        int l=0;
        int r=0;
        for (char c : s.toCharArray()) {
            if(c=='('){
                r+=2;
                if(r%2==1){
                    l++;
                    r--;
                }
            }else{
                r--;
                if(r==-1){
                    r=1;
                    l++;
                }
            }
        }
        return l+r;
    }
}
