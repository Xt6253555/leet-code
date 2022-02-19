package one_one;
//区间加法(差分数组)
//8,5,9,6,1
//8 6 10 7 1(1-3)
//8,-3,4,-3,-5
//8,-2,4,-3,-6
public class demo370 {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] arr = new int[length];
        for (int i = 0; i < updates.length; i++) {
            for (int j = 0; j < updates[i].length;) {
                diff(updates[i][j],updates[i][j+1],updates[i][j+2],arr);
                break;
            }
        }
        int[]sum = new int[length];
        sum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum[i] = sum[i-1]+arr[i];
        }
        return sum;
    }
    public void diff(int l ,int r ,int val,int[]arr){
        arr[l]+=val;
        if(r+1<arr.length){
            arr[r+1]-=val;
        }
    }
}
