package test;

import two_one.TreeNode;

public class demo105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    private TreeNode build(int[] preorder, int l1, int r1, int[] inorder, int l2, int r2) {
        if(l1>r1||l2>r2)return null;
        int val = preorder[l1];
        int index = 0;
        for (int i = 0; i <= r2; i++) {
            if(inorder[i]==val){
                index = i;
                break;
            }
        }
        TreeNode node = new TreeNode(val);
        int leftSize = index-l2;
        node.left = build(preorder,l1+1,l1+leftSize,inorder,l2,index-1);
        node.right = build(preorder,l1+leftSize+1,r1,inorder,index+1,r2);
        return node;
    }
}
