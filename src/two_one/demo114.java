package two_one;

import java.util.LinkedList;

//二叉树展开为链表(迭代)
public class demo114 {
    public static void main(String[] args) {

    }
    public void flatten(TreeNode root) {
        if(root==null)return ;
        LinkedList<TreeNode> list = new LinkedList<>();
        flattenList(root,list);
        for (int i = 1; i < list.size(); i++) {
            TreeNode left = list.get(i - 1);
            TreeNode right = list.get(i);
            left.left=null;
            left.right = right;
        }
    }
    public static void flattenList(TreeNode root, LinkedList<TreeNode> list){
        if(root==null)return;
        list.add(root);
        flattenList(root.left,list);
        flattenList(root.right,list);
    }
}
