package two_one;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode next;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public static void pre(TreeNode root){
        if(root==null)return;
        System.out.println(root.val);
        pre(root.left);
        pre(root.right);
    }
}
