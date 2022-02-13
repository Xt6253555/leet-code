package sort;

import java.util.Arrays;

//快速排序
public class demo5 {
    public static void main(String[] args) {
        int[] arr = {84, 83, 88, 87, 61, 50, 70, 60, 80, 99};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr) {
        quick(arr,0,arr.length-1);
        return arr;
    }

    public static void quick(int[] arr,int start,int end){
        if(start>=end)return;
        int mid = partition(arr, start, end);
        quick(arr,start,mid-1);
        quick(arr,mid+1,end);
    }

    //双指针分区，分别找比支点大的和比支点小的进行交换，直到left=right
    public static int partition(int[] arr,int start,int end){
        int pivot = arr[start];
        int left = start+1;
        int right = end;
        while (left<right){
            //分别找比支点大的和小的退出while
            while (left<right&&arr[left]<pivot)left++;
            while (left<right&&arr[right]>pivot)right--;
            if(left<right){
                exchange(arr,left,right);
                left++;
                right--;
            }
        }
        if(left==right&&arr[right]>=pivot)right--;
        //交换支点
        exchange(arr,start,right);
        return right;
    }
    private static void exchange(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
