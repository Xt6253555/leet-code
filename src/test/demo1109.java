package test;

public class demo1109 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] sum = new int[n];
        int[] arr = new int[n];
        for (int[] booking : bookings) {
            int i = booking[0];
            int j = booking[1];
            int val = booking[2];
            diff(i,j,val,arr);
        }
        sum[0]=arr[0];
        for (int i = 1; i < n; i++) {
            sum[i]=arr[i]+sum[i-1];
        }
        return sum;
    }
    public void diff(int i,int j,int val,int[] arr){
        arr[i-1]+=val;
        if(j<arr.length){
            arr[j]-=val;
        }
    }
}
