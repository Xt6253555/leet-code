package two_one;
//最大二叉树
public class demo654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums,0,nums.length-1);
    }
    public static TreeNode build(int[] nums,int l,int r){
        if(l>r)return null;
        int index = -1,max = Integer.MIN_VALUE;
        for (int i = l; i <= r; i++) {
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
        }
        TreeNode treeNode = new TreeNode(max);
        treeNode.left = build(nums, l, index - 1);
        treeNode.right = build(nums, index+1, r);
        return treeNode;
    }
}
