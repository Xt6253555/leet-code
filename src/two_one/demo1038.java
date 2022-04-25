package two_one;
//二叉搜索树转累加树
public class demo1038 {
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if(root==null)return root;
        bstToGst(root.right);
        sum+= root.val;
        root.val = sum;
        bstToGst(root.left);
        return root;
    }
}
