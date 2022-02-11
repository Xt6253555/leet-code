package sort;

import java.util.Arrays;

//冒泡排序
public class demo1 {
    public static void main(String[] args) {
        int[] arr = {2,5,4,3,1,8,7};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
        return arr;
    }
}
