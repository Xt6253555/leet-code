package test;

import two_one.TreeNode;

import java.util.ArrayDeque;

public class demo1022 {
    public static void main(String[] args) {

    }
    public int sumRootToLeaf(TreeNode root) {
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        int sum = 0;
        while (!deque.isEmpty()){
            TreeNode node = deque.pollFirst();
            if(node.left!=null){
                node.left.val = node.left.val+node.val*2;
                deque.add(node.left);
            }

            if(node.left!=null){
                node.left.val = node.left.val+node.val*2;
                deque.add(node.right);
            }

            if(node.left==null&&node.right==null) sum+=node.val;
        }
        return sum;
    }
}
