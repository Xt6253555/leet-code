package one_one;
//拼车(差分数组)
public class demo1094 {
    public static boolean carPooling(int[][] trips, int capacity) {
        if(trips.length==1)return trips[0][0]<=capacity;
        int l = 0;
        for (int i = 0; i < trips.length; i++) {
            if(l<trips[i][2]){
                l = trips[i][2];
            }
        }
        int[] arr = new int[l+1];
        for (int i = 0; i < trips.length; i++) {
            for (int j = 0; j < trips[i].length;) {
                diff(trips[i][j],trips[i][j+1],trips[i][j+2]-1,arr);
                break;
            }
        }
        int[] restore = restore(arr);
        int max = 0;
        for (int i = 0; i < restore.length; i++) {
            if(max<restore[i]){
                max = restore[i];
            }
        }
        return max<=capacity;
    }
    public static void diff(int val,int l,int r,int[] arr){
        arr[l]+=val;
        if(r+1<arr.length){
            arr[r+1]-=val;
        }
    }
    public static int[] restore(int [] arr){
        int[] sum = new int[arr.length];
        sum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum[i] = sum[i-1]+arr[i];
        }
        return sum;
    }
}
