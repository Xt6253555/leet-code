package test;

public class demo1094 {
    public static void main(String[] args) {
        int[][]arr = {{9,0,1},{3,3,7}};
        demo1094 demo1094 = new demo1094();
        boolean b = demo1094.carPooling(arr, 4);
        System.out.println(b);
    }
    public boolean carPooling(int[][] trips, int capacity) {
        int max = 0;
        for (int[] trip : trips) {
            max=Math.max(max,trip[2]);
        }
        int[] sum = new int[max];
        int[] arr = new int[max];
        for (int[] trip : trips) {
            int val = trip[0];
            int i = trip[1];
            int j = trip[2];
            diff(val,i,j,arr);
        }
        sum[0]=arr[0];
        for (int i = 1; i < max; i++) {
            sum[i]=sum[i-1]+arr[i];
        }
        for (int i : sum) {
            if(i>capacity)return false;
        }
        return true;
    }
    public void diff(int val, int i, int j, int[] arr){
        arr[i]+=val;
        if(j<arr.length){
            arr[j]-=val;
        }
    }
}
