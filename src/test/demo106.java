package test;

import two_one.TreeNode;

public class demo106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int l1 = 0;
        int r1 = inorder.length-1;
        int l2 = 0;
        int r2 = postorder.length-1;
        return build(inorder,l1,r1,postorder,l2,r2);
    }
    private TreeNode build(int[] inorder, int l1, int r1, int[] postorder, int l2, int r2) {
        if(l1>r1||l2>r2)return null;
        int val = postorder[r2];
        int index = 0;
        for (int i = 0; i <= r1; i++) {
            if(val==inorder[i]){
                index=i;
                break;
            }
        }
        TreeNode node = new TreeNode(val);
        int leftSize = index-l1;
        node.left = build(inorder,l1,index-1,postorder,l2,leftSize+l2);
        node.right = build(inorder,index+1,r1,postorder,leftSize+l2+1,r2-1);
        return node;
    }
}
