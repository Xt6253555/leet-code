package test;

import two_one.TreeNode;

import java.util.LinkedList;

public class demo114 {
    public void flatten(TreeNode root) {
        if(root==null)return ;
        LinkedList<TreeNode> list = new LinkedList<>();
        flattenList(root,list);
        for (int i = 1; i < list.size(); i++) {
            TreeNode left = list.get(i - 1);
            TreeNode right = list.get(i);
            left.left=null;
            left.right = right;
        }
    }
    public static void flattenList(TreeNode root, LinkedList<TreeNode> list){
        if(root==null)return;
        list.add(root);
        flattenList(root.left,list);
        flattenList(root.right,list);
    }
}
