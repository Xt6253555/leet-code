package two_one;

//把二叉搜索树转换为累加树(和1038题一致)
public class demo538 {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root == null) return root;
        convertBST(root.right);
        sum+=root.val;
        root.val = sum;
        convertBST(root.left);
        return root;
    }
}
