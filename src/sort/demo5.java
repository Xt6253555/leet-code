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

    static int partition(int[] nums, int lo, int hi) {
        if (lo == hi) return lo;
        // 将 nums[lo] 作为默认分界点 pivot
        int pivot = nums[lo];
        // j = hi + 1 因为 while 中会先执⾏ --
        int i = lo, j = hi + 1;
        while (true) {
            // 保证 nums[lo..i] 都⼩于 pivot
            while (nums[++i] < pivot) {
                if (i == hi) break;
            }
            // 保证 nums[j..hi] 都⼤于 pivot
            while (nums[--j] > pivot) {
                if (j == lo) break;
            }
            if (i >= j) break;
            // 如果⾛到这⾥，⼀定有：
            // nums[i] > pivot && nums[j] < pivot
            // 所以需要交换 nums[i] 和 nums[j]，
            // 保证 nums[lo..i] < pivot < nums[j..hi]
            swap(nums, i, j);
        }
        // 将 pivot 值交换到正确的位置
        swap(nums, lo, j);
        // 现在 nums[lo..j-1] < nums[j] < nums[j+1..hi]
        return j;
    }
    // 交换数组中的两个元素
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
