package two_one;
//从前序与中序遍历序列构造二叉树
public class demo105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,0,preorder.length-1,
                        inorder,0,inorder.length-1);
    }
    public static TreeNode build(int[] preorder, int pL,int pR,
                                 int[] inorder,int iL,int iR){
        if(pL>pR||iL>iR)return null;
        int root = preorder[pL];
        int index = 0;
        for (int i = iL; i <= iR; i++) {
            if(root==inorder[i]){
                index = i;
                break;
            }
        }
        TreeNode node = new TreeNode(root);
        //左子树个数
        int leftSize = index - iL;
        node.left = build(preorder, pL + 1, pL + leftSize, inorder, iL, index - 1);
        node.right = build(preorder, pL+leftSize + 1, pR, inorder, index + 1, iR);
        return node;
    }
}
