package one_one;
//航班预定统计(差分数组)
public class demo1109 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < bookings.length; i++) {
            for (int j = 0; j < bookings[i].length;) {
                diff(bookings[i][j], bookings[i][j + 1], bookings[i][j + 2], arr);
                break;
            }
        }
        int[] sum = new int[n];
        sum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum[i] = arr[i]+sum[i-1];
        }
        return sum;
    }
    public static void diff(int i,int j,int val,int[] arr){
        arr[i-1]+=val;
        if(j<arr.length){
            arr[j]-=val;
        }
    }
}
