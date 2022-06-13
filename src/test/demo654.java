package test;

import two_one.TreeNode;

public class demo654 {
    public static void main(String[] args) {
        demo654 demo654 = new demo654();
        int[]arr = {3,2,1,6,0,5};
        TreeNode node = demo654.constructMaximumBinaryTree(arr);
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums,0,nums.length-1);
    }

    private TreeNode build(int[] nums, int l, int r) {
        if(l>r)return null;
        int index = 0;
        int max = Integer.MIN_VALUE;
        for (int i = l; i <= r; i++) {
            if(nums[i]>max){
                max=nums[i];
                index = i;
            }
        }
        TreeNode node = new TreeNode(max);
        node.left = build(nums,l,index-1);
        node.right = build(nums,index+1,r);
        return node;
    }
}
