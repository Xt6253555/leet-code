package five_one;

import com.sun.org.apache.regexp.internal.RE;

//阶乘函数后 K 个零
public class demo793 {
    public int preimageSizeFZF(long K) {
        long l = K, r = 10*K + 1;
        while (l<r){
            long mid = (l+r)/2;
            long zeta = zeta(mid);
            if(zeta==K) return 5;
            if(zeta<K){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return 0;
    }
    public long zeta(long n) {
        int sum = 0;
        while (n>0){
            sum+=n/5;
            n=n/5;
        }
        return sum;
    }
}
