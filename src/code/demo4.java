package code;

public class demo4 {
    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num = new int[nums1.length+nums2.length];
        int index1 = 0;
        int index2 = 0;
        while (index1<nums1.length&&index2<nums2.length){
            if(nums1[index1]<nums2[index2]){
                num[index1+index2] = nums1[index1++];
            }else {
                num[index1+index2] = nums2[index2++];
            }
        }
        while (index1<nums1.length){
            num[index1+index2] = nums1[index1++];
        }
        while (index2<nums2.length){
            num[index1+index2] = nums2[index2++];
        }
        if(num.length%2==0){
            int l = num.length/ 2;
            return (double) (num[l]+num[l-1])/2;
        }
        return num[num.length/2];
    }
}
