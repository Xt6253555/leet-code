package five_one;

import java.util.Arrays;

public class demo1288 {
    public static void main(String[] args) {
        int[][] arr = {{3,10},{4,10},{5,11}};
        int i = removeCoveredIntervals(arr);
        System.out.println(i);

    }
    public static int removeCoveredIntervals(int[][] intvs) {
        // 按照起点升序排列，起点相同时降序排列
        Arrays.sort(intvs,(a, b)->{
            if(a[0]==b[0]){
                return b[1]-a[1];
            }
            return a[0]-b[0];
        });
        int count=0;
        int pre = 0;
        for (int[] intv : intvs) {
            int end = intv[1];
            if(pre<end){
                count++;
                pre=end;
            }
        }
        return count;
    }
}
