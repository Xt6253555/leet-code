package test;

import two_one.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//寻找重复的子树
public class demo652 {
    HashMap<String, Integer> map = new HashMap<>();
    List<TreeNode> list = new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        reverse(root);
        return list;
    }
    public String reverse(TreeNode root){
        String left = reverse(root.left);
        String right = reverse(root.right);
        String sub = left+","+right+","+ root.val;
        int freq = map.getOrDefault(sub, 0);
        if(freq==1)list.add(root);
        map.put(sub,freq+1);
        return sub;
    }
}
