package five_one;

import java.util.Arrays;

//合并区间
public class demo56 {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        int[][] merge = merge(arr);
    }
    public static int[][] merge(int[][] intervals) {
        if(intervals.length==1)return intervals;
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        int[][] res = new int[intervals.length][2];
        int idx = -1;
        for (int[] interval : intervals) {
            if(idx==-1||interval[0]>res[idx][1]){
                idx++;
                res[idx]=interval;
            }else{
                res[idx][1] = Math.max(res[idx][1],interval[1]);
            }
        }
        return Arrays.copyOf(res, idx + 1);
    }
}
