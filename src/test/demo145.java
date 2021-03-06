package test;

import two_one.TreeNode;

import java.util.ArrayList;
import java.util.List;

//二叉树的后序遍历
public class demo145 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return list;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;
    }
}
