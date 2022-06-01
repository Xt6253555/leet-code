package test;

import two_one.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class demo103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root==null)return list;
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        int count=0;
        deque.add(root);
        while (!deque.isEmpty()){
            int size = deque.size();
            ArrayList<Integer> res = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pollFirst();
                res.add(node.val);
                if(node.left!=null)deque.add(node.left);
                if(node.right!=null)deque.add(node.right);
            }
            if(count%2==1){
                Collections.reverse(res);
            }
            list.add(res);
            count++;
        }
        return list;
    }
}
