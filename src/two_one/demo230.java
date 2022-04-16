package two_one;

import java.util.ArrayList;
import java.util.List;
// 二叉搜索树中第K小的元素
public class demo230 {
    List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        mid(root,list);
        return list.get(k);
    }
    public void mid(TreeNode root,List<Integer> list){
        if(root==null)return;
        mid(root.left,list);
        list.add(root.val);
        mid(root.right,list);
    }
}
