package test;

import two_one.TreeNode;

//删除二叉搜索树中的节点
public class demo450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return root;
        if(root.val==key){
            if(root.left==null)return root.right;
            if(root.right==null)return root.left;
            // 获得右⼦树最⼩的节点
            TreeNode minNode = getMin(root.right);
            //删除右子树（最左边就是最小节点）
            root.right = deleteNode(root.right,minNode.val);
            minNode.left = root.left;
            minNode.right = root.right;
            root = minNode;
        }else if(root.val>key){
            root.left = deleteNode(root.left,key);
        }else {
            root.right = deleteNode(root.right,key);
        }
        return root;
    }

    private TreeNode getMin(TreeNode root) {
        while (root.left!=null)root = root.left;
        return root;
    }
}
