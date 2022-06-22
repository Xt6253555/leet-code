package sort;

import java.util.Arrays;
import java.util.Stack;

//快速排序
public class demo5 {
    public static void main(String[] args) {
        int[] arr = {84, 83, 88, 87, 61, 50, 70, 60, 80, 99};
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

    static int partition(int[] arr, int left, int right) {
        // 设定基准值（pivot）
        int index = left + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[left]) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, left, index - 1);
        return index - 1;
    }
    // 交换数组中的两个元素
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
