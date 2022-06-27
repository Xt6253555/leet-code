package test;

import two_one.TreeNode;

//二叉树的最近公共祖先
public class demo236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||p==root||q==root)return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left==null)return right;
        if(right==null)return left;
        return root;
    }
}
