package sort;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[]arr = {4,5,1,2,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int[] arr){
        // 建立长度为 9 的数组，下标 0~8 对应数字 1~9
        int[] counting = new int[6];
        // 遍历 arr 中的每个元素
        for (int element : arr) {
            // 将每个整数出现的次数统计到计数数组中对应下标的位置
            counting[element - 1]++;
        }
        // 记录前面比自己小的数字的总数
        int preCounts = 0;
        for (int i = 0; i < counting.length; i++) {
            int temp = counting[i];
            // 将 counting 计算成当前数字在结果中的起始下标位置。位置 = 前面比自己小的数字的总数。
            counting[i] = preCounts;
            // 当前的数字比下一个数字小，累计到 preCounts 中
            preCounts += temp;
        }
        int[] result = new int[arr.length];
        for (int element : arr) {
            // counting[element - 1] 表示此元素在结果数组中的下标
            int index = counting[element - 1];
            result[index] = element;
            // 更新 counting[element - 1]，指向此元素的下一个下标
            counting[element - 1]++;
        }
        // 将结果赋值回 arr
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
        }
    }
}
