package two_one;
//二叉树的最大深度
public class demo104 {
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;
    }
}
