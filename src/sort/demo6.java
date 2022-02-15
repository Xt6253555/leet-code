package sort;

import java.util.Arrays;

//归并排序
public class demo6 {
    public static void main(String[] args) {
        int[] arr1 = {1,4,5,7,9};
        int[] arr2 = {2,3,6,9,10,11};
        int[] arr = {84, 83, 88, 87, 61, 50, 70, 60, 80, 99};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[]sort(int[] arr){
        return mergerSort(arr,0,arr.length-1);
    }
    public static int[] mergerSort(int[] arr,int start,int end){
        if(start==end)return new int[]{arr[start]};
        int mid = (start+end)/ 2;
        int[] left = mergerSort(arr, start, mid);
        int[] right = mergerSort(arr, mid+1,end);
        return merge(left,right);
    }
    public static int[] merge(int[] arr1,int[] arr2){
        int index1 = 0;
        int index2 = 0;
        int[] sum = new int[arr1.length+arr2.length];
        while (index1<arr1.length&&index2<arr2.length){
            if(arr1[index1]<arr2[index2]){
                sum[index1+index2] = arr1[index1++];
            }else{
                sum[index1+index2] = arr2[index2++];
            }
        }
        while (index1!=arr1.length){
            sum[index1+index2] = arr1[index1++];
        }
        while (index2!=arr2.length){
            sum[index1+index2] = arr2[index2++];
        }
        return sum;
    }
    //优化，减少临时空间
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
