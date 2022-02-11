package sort;

import java.util.Arrays;
//插入排序
public class demo3 {

    public static void main(String[] args) {
        int[] arr = {4,3,2,1,5,8,7,6,0,10,43,21,67,45,54};
        System.out.println(Arrays.toString(sort(arr)));
    }
    //交换法
    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int j = i+1;
            while(j>0){
                if(arr[j-1]>arr[j]){
                    int swap = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = swap;
                }
                j--;
            }
        }
        return arr;
    }
    //移动法
    //4,1,3,2
    public static int[] sortV2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int j =i+1;
            int max = i;
            while (j>0){
                if(arr[max]>arr[j]){
                    max++;
                }
                j--;
            }
            arr[i] = arr[max];
        }
        return arr;
    }
}
