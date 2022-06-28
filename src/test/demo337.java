package test;

import two_one.TreeNode;

//打家劫舍III
public class demo337 {
    public static void main(String[] args) {
        demo337 demo337 = new demo337();
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(2);
        node.right = new TreeNode(4);
        demo337.rob(node);
    }
    public int rob(TreeNode root) {
        int[] res = res(root);
        return Math.max(res[0],res[1]);
    }
    public int[] res(TreeNode root){
        if (root == null) return new int[2];
        int[] res = new int[2];
        int[] left = res(root.left);
        int[] right = res(root.right);
        //0代表不抢，1代表抢
        res[0] = Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        //选择根节点，即左右不抢对应的大小
        res[1] = root.val+left[0]+right[0];
        return res;
    }
}
