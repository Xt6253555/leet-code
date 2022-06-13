package test;

import two_one.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class demo111 {
    public int minDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node.left==null&&node.right==null)return depth;
                if (node.left!=null){
                    node = node.left;
                    queue.offer(node);
                }
                if (node.right!=null){
                    node = node.right;
                    queue.offer(node);
                }
            }
            depth++;
        }
        return depth;
    }
}
