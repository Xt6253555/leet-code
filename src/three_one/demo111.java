package three_one;

import two_one.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class demo111 {
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        Queue<TreeNode> node = new LinkedList<>();
        int depth = 1;
        node.offer(root);
        while (!node.isEmpty()){
            int size = node.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = node.poll();
                if(cur.right==null&&cur.left==null)return depth;
                if(cur.left!=null)node.offer(cur.left);
                if(cur.right!=null)node.offer(cur.right);
            }
            depth++;
        }
        return depth;
    }
}
