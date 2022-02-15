package sort;

import java.util.Arrays;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        int[]arr = {90,84, 83, 88, 87, 61, 50, 70, 60,80,90, 80, 99};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int[] arr,int start, int end){
        start = 0;
        end = arr.length-1;
        Stack<Integer> stack = new Stack<>();
        stack.push(end);
        stack.push(start);
        while (!stack.isEmpty()){
            int s = stack.pop();
            int e = stack.pop();
            int index = partition(arr, s, e);
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
    //2,4,3,5,1
    public static int partition(int[] arr,int start,int end){
        int l = start+1;
        int r = end;
        int pivot = arr[start];
        while (l<r){
            while (l<r&&arr[l]<pivot)l++;
            while (l<r&&arr[r]>pivot)r--;
            if(l<r){
                exchange(arr,l,r);
                l++;
                r--;
            }
        }
        if(l==r&&arr[r]>=pivot)r--;
        exchange(arr,start,r);
        return r;
    }
    public static void exchange(int[] arr,int start,int end){
        int swap = arr[start];
        arr[start] =arr[end];
        arr[end] = swap;
    }
}
