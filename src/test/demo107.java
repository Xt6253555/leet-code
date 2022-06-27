package test;

import two_one.TreeNode;

import java.util.*;

//二叉树的层序遍历II
public class demo107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null)return new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<List<Integer>> tree = new ArrayList<>();
        while(!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            TreeNode temp;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                temp = queue.remove();
                list.add(temp.val);
                if(temp.left!=null)queue.add(temp.left);
                if(temp.right!=null)queue.add(temp.right);
            }
            tree.add(list);
        }
        Collections.reverse(tree);
        return tree;
    }
}
