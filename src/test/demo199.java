package test;

import two_one.TreeNode;

import java.util.*;

//二叉树的右侧视图
public class demo199 {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null)return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        list.add(root.val);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if(i==size-1){
                    list.add(poll.val);
                }
                if(poll.right!=null){
                    queue.offer(poll.right);
                }
                if(poll.left!=null){
                    queue.offer(poll.left);
                }
            }
        }
        return list;
    }
}
