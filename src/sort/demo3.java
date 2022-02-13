package sort;

import java.util.Arrays;
//插入排序
public class demo3 {

    public static void main(String[] args) {
//        int[] arr = {4,3,2,1,5,8,7,6,0,10,43,21,67,45,54};
        int[] arr = {4,1,3,2};
        System.out.println(Arrays.toString(sortV2(arr)));
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
    //1,4,3,2
    public static int[] sortV2(int[] arr){
        // 从第二个数开始，往前插入数字
        for (int i = 1; i < arr.length; i++) {
            int currentNumber = arr[i];
            int j = i - 1;
            // 寻找插入位置的过程中，不断地将比 currentNumber 大的数字向后挪
            while (j >= 0 && currentNumber < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            // 两种情况会跳出循环：1. 遇到一个小于或等于 currentNumber 的数字，跳出循环，currentNumber 就坐到它后面。
            // 2. 已经走到数列头部，仍然没有遇到小于或等于 currentNumber 的数字，也会跳出循环，此时 j 等于 -1，currentNumber 就坐到数列头部。
            arr[j + 1] = currentNumber;
        }
        return arr;
    }
}
