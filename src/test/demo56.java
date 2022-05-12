package test;

import java.util.Arrays;

public class demo56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(int[]a,int[]b)->a[0]-b[0]);
        int idx = -1;
        int[][] res= new int[intervals.length][2];
        for (int[] interval : intervals) {
            if(idx==-1||interval[0]>res[idx][1]){
                idx++;
                res[idx]=interval;
            }else{
                res[idx][1]=Math.max(res[idx][1],interval[1]);
            }
        }
        return Arrays.copyOf(res,idx+1);
    }
}
