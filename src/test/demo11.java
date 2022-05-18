package test;

public class demo11 {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int res =0;
        while (l<r){
            int cur=Math.max(height[l],height[r])*(r-l);
            res=Math.max(cur,res);
            if(height[l]<height[r]){
                l++;
            }else {
                r--;
            }
        }
        return res;
    }
}
