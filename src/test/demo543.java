package test;

import two_one.TreeNode;

//二叉树的直径
public class demo543 {
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
