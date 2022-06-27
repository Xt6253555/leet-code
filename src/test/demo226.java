package test;

import two_one.TreeNode;

//翻转二叉树
public class demo226 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return root;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
