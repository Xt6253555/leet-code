package sort;

import java.util.Arrays;

//选择排序
public class demo2 {
    public static void main(String[] args) {
        int []arr = {8,7,5,4,3,6,1,2};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[]sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int swap = arr[i];
            arr[i] = arr[min];
            arr[min] = swap;
        }
        return arr;
    }
}
