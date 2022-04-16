package two_one;
//二叉树的直径（左子树深度+右子树深度）
public class demo543 {
    public static void main(String[] args) {

    }

    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        maxDepth(root);
        return max;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        max = Math.max(max,left+right);
        return Math.max(left, right) + 1;
    }
}
