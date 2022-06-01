package test;

import two_one.TreeNode;

public class demo100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 判断⼀对节点是否相同
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
    }

}
