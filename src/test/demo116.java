package test;

import two_one.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class demo116 {
    public TreeNode connect(TreeNode root) {
        if(root==null)return root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(i<size-1){
                    node.next = queue.peek();
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
        }
        return root;
    }
}