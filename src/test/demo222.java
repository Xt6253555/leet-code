package test;

import two_one.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

//完全二叉树的节点
public class demo222 {
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count =0;
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();
            count++;
            if(node.left!=null)queue.add(node.left);
            if(node.right!=null)queue.add(node.right);
        }
        return count;
    }
}
