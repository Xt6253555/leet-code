package two_one;

import java.util.LinkedList;
import java.util.Queue;

//填充每个节点的下一个右侧节点指针
public class demo116 {
    public TreeNode connect(TreeNode root) {
        if(root==null)return root;
        connectV2(root.left,root.right);
        return root;
    }
    public static void connectV2(TreeNode left,TreeNode right){
        if(left==null||right==null)return ;
        left.next = right;
        connectV2(left.left,left.right);
        connectV2(right.left,right.right);
        connectV2(left.right,right.left);
    }
    //迭代
    public TreeNode connectList(TreeNode root) {
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
