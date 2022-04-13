package two_one;
//从前序与后序遍历序列构造二叉树
public class demo889 {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3,6,7};
        int num[] = {4,5,2,6,7,3,1};
        constructFromPrePost(arr,num);
    }
    public static TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return build(preorder,0,preorder.length-1,
                    postorder,0,postorder.length-1);
    }
    public static TreeNode build(int[] preorder, int preL,int preR,
                                 int[] postorder,int postL,int postR){
        if(preL>preR||postL>postR)return null;
        if (preL == preR) return new TreeNode(preorder[preL]);
        int root = preorder[preL+1];
        int index = -1;
        for (int i = postL; i <= postR; i++) {
            if(root==postorder[i]){
                index = i;
                break;
            }
        }
        TreeNode node = new TreeNode(preorder[preL]);
        // 左⼦树的元素个数
        int leftSize = index - postL + 1;
        node.left = build(preorder, preL + 1, preL + leftSize, postorder, postL, index);
        node.right = build(preorder, preL + leftSize + 1, preR, postorder, index + 1, postR - 1);
        return node;
    }
}
