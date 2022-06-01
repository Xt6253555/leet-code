package test;

import two_one.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class demo102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        while (!deque.isEmpty()){
            int size = deque.size();
            ArrayList<Integer> res = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pollFirst();
                res.add(node.val);
                if(node.left!=null){
                    deque.add(node.left);
                }
                if(node.right!=null){
                    deque.add(node.right);
                }
            }
            list.add(res);
        }
        return list;
    }
}
