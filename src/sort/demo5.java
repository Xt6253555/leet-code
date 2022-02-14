package sort;

import java.util.Arrays;
import java.util.Stack;

//快速排序
public class demo5 {
    public static void main(String[] args) {
        int[] arr = {84, 83, 88, 87, 61, 50, 70, 60, 80, 99};
//        int[] arr = {2,3,4,5,1};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr) {
//        quick(arr,0,arr.length-1);
        quickStack(arr,0,arr.length-1);
        return arr;
    }

    public static void quick(int[] arr,int start,int end){
        if(start>=end)return;
        int mid = partition(arr, start, end);
        quick(arr,start,mid-1);
        quick(arr,mid+1,end);
    }

//    栈实现非递归快排
//    1.用栈集合存放左右下标
//    2.用一个方法来得出中下标位置
//    3.判断中下标的左右区间
//    4.回到步骤1循环这几步操作，知道栈为空，则排序完成。
    public static void quickStack(int[] arr,int start,int end){
        Stack<Integer> stack = new Stack<>();
        stack.push(end);
        stack.push(start);
        while (!stack.isEmpty()){
            Integer s = stack.pop();
            Integer e = stack.pop();
            int index = partition(arr,s,e);
            if(s<index-1){
                stack.push(index-1);
                stack.push(s);
            }
            if(index+1<e){
                stack.push(e);
                stack.push(index+1);
            }
        }
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
