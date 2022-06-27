package test;

import two_one.TreeNode;

//二叉搜索树转换为累加树
public class demo538 {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root == null) return root;
        convertBST(root.right);
        sum+=root.val;
        root.val = sum;
        convertBST(root.left);
        return root;
    }
}
