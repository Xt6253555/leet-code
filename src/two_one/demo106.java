package two_one;
//从中序与后序遍历序列构造二叉树
public class demo106 {
    public static void main(String[] args) {
        int in[] = {9,3,15,20,7};
        int post[] = {9,15,7,20,3};
        TreeNode node = buildTree(in, post);
    }
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder,0,inorder.length-1,
                    postorder,0,postorder.length-1);
    }

    public static TreeNode build(int[] inorder, int iL, int iR,
                                 int[] postorder, int pL, int pR) {
        if(iL>iR||pL>pR)return null;
        int root  = postorder[pR];
        int index = -1;
        for (int i = iL; i <= iR; i++) {
            if(root==inorder[i]){
                index = i;
                break;
            }
        }
        TreeNode node = new TreeNode(root);
        int leftSize = index-iL;
        node.left = build(inorder,iL,index-1,postorder,pL,pL+leftSize-1);
        node.right = build(inorder,index+1,iR,postorder,pL+leftSize,pR-1);
        return node;
    }
}
