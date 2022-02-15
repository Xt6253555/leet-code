package sort;

import java.util.Arrays;

//堆排序
public class demo7 {
    public static void main(String[] args) {
        int[] arr = {84, 83, 88, 87, 61, 50, 70, 60, 80, 99};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void heapSort(int[] arr){
        //构建大顶堆，获取最大值(根节点)
        buildHeap(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            // 将最大值交换到数组最后
            swap(arr,0,i);
            //调整剩余数组（数量i-1）
            maxHeap(arr,0,i);

        }
    }
//    构建出一个大顶堆
    public static void buildHeap(int[]arr){
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            maxHeap(arr,i,arr.length);
        }
    }
//    取出堆顶的数字(arr.length/2-1)
//    循环往复，完成整个排序。
    public static void maxHeap(int[]arr,int i ,int heapSize){
        int l = 2*i+1;
        int r = l+1;
        int largest = i;
        if(l<heapSize&&arr[l]>arr[largest])largest=l;
        if(r<heapSize&&arr[r]>arr[largest])largest=r;
        if(largest!=i){
            swap(arr,i,largest);
            //递归循环整个
            maxHeap(arr,largest,heapSize);
        }
    }
    public static void swap(int[] arr, int l,int r){
        int swap = arr[l];
        arr[l] = arr[r];
        arr[r] = swap;
    }
}
