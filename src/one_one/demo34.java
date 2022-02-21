package one_one;
//排序数组查找元素的第一个和最后一个的位置(二分搜索)
public class demo34 {
    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = search(nums,target,true);
        arr[1] = search(nums,target,false);
        return arr;
    }
    public static int search(int[] nums ,int target,boolean flag){
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                if (flag) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        if (flag) {
            if (left >= nums.length || nums[left] != target) {
                return -1;
            }
        } else {
            if (right < 0 || nums[right] != target) {
                return -1;
            }
        }
        return flag ? left : right;
    }
}
