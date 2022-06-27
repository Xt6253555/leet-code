package test;

import two_one.TreeNode;

//单值二叉树
public class demo965 {
    public boolean isUnivalTree(TreeNode root) {
        return uniVal(root,root.val);
    }
    public boolean uniVal(TreeNode t,int val){
        if(t==null){return true;}
        if(t.val!=val){return false;}
        return uniVal(t.left,val)&&uniVal(t.right,val);
    }
}
