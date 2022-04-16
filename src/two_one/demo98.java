package two_one;

import java.util.Stack;

//验证二叉搜索树
public class demo98 {
    public boolean isValidBST(TreeNode root) {
        return validV2(root,null,null);
    }

    private boolean validV2(TreeNode root, TreeNode min, TreeNode max) {
        if (root==null)return true;
        if (min!=null&&root.val<=min.val)return false;
        if (max!=null&&root.val>=max.val)return false;
        return validV2(root.left,min,root)&&
                validV2(root.right,root,max);
    }
}
