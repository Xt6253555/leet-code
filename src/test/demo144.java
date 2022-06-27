package test;

import two_one.TreeNode;

import java.util.ArrayList;
import java.util.List;

//二叉树的前序遍历
public class demo144 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null)return list;
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}
