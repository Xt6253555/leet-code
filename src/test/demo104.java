package test;

import two_one.TreeNode;

public class demo104 {
    int sum = 0;
    public int maxDepth(TreeNode root) {
        if (root==null)return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}