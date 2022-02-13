package sort;

import java.util.Arrays;

public class demo6_1 {
    public static void main(String[] args) {
        int[] arr = {84, 83, 88, 87, 61, 50, 70, 60, 80, 99,4,5,8,7,0,10};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr){
        if (arr.length==0)return;
        int[] result = new int[arr.length];
        mergeSortV2(arr,0,arr.length-1,result);
    }
    public static void mergeSortV2(int[] arr,int start,int end, int[] result){
        if(start==end)return;
        int mid = (start+end)/2;
        mergeSortV2(arr,start,mid,result);
        mergeSortV2(arr,mid+1,end,result);
        sort(arr,start,end,result);

    }
    public static void sort(int[] arr,int start,int end, int[] result){
        int middle = (start + end) / 2;
        // 数组 1 的首尾位置
//        int start1 = start;
//        int end1 = middle;
        // 数组 2 的首尾位置
//        int start2 = middle + 1;
//        int end2 = end;
        // 用来遍历数组的指针
        int index1 = start;
        int index2 = middle + 1;
        // 结果数组的指针
        int resultIndex = start;
        while (index1<=middle&&index2<=end){
            if(arr[index1]<arr[index2]){
                result[resultIndex++] = arr[index1++];
            }else{
                result[resultIndex++] = arr[index2++];
            }
        }
        while (index1<=middle){
            result[resultIndex++] = arr[index1++];
        }
        while (index2<=end){
            result[resultIndex++] = arr[index2++];
        }
        for (int i = start; i <=end; i++) {
            arr[i] = result[i];
        }
    }
}
