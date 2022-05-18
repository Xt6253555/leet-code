package test;

public class demo42 {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int l =0;
        int r =0;
        int res = 0;
        while (left<right){
            l=Math.max(l,height[left]);
            r=Math.max(r,height[right]);
            if(l<r){
                res+=l-height[left];
                left++;
            }else {
                res+=r-height[right];
                right--;
            }
        }
        return res;
    }
}
