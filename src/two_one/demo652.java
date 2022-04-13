package two_one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//寻找重复的子树
public class demo652 {
    // 记录所有子树以及出现的次数
    HashMap<String, Integer> map = new HashMap<>();
    // 记录重复的子树根节点
    List<TreeNode> list = new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        reverse(root);
        return list;
    }
    public String reverse(TreeNode root){
        if(root==null)return "#";
        String left = reverse(root.left);
        String right = reverse(root.right);
        String sub = left+","+right+","+ root.val;
        int freq = map.getOrDefault(sub, 0);
        // 多次重复也只会被加入结果集一次
        if(freq==1)list.add(root);
        // 给子树对应的出现次数加一
        map.put(sub,freq+1);
        return sub;
    }
}
