package sort;

import java.util.Arrays;

//希尔排序（改良插入排序）
// [84, 83, 88, 87, 61, 50, 70, 60, 80, 99]
//[50,84],[70,83],[60,88],[80,87],[61,99]
public class demo4 {
    public static void main(String[] args) {
        int[] arr = {84, 83, 88, 87, 61, 50, 70, 60, 80, 99};
        System.out.println(Arrays.toString(sort(arr)));

    }
    public static int[] sort(int[] arr){
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //插入排序
            for (int i = gap; i < arr.length; i++) {
                int j = i-gap;
                while (j>=0){
                    if(arr[j]>arr[j+gap]){
                        int swap = arr[j+gap];
                        arr[j+gap] = arr[j];
                        arr[j] = swap;
                    }
                    j-=gap;
                }
            }
        }
        return arr;
    }
}
