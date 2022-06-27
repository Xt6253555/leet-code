package test;

import two_one.TreeNode;

import java.util.LinkedList;

//二叉树的序列化和反序列化
public class demo297 {
    public String serialize(TreeNode root) {
        if (root==null)return null;
        StringBuilder sb = new StringBuilder();
        build(root,sb);
        return sb.toString();
    }
    public void build(TreeNode root, StringBuilder sb){
        if(root==null){
            sb.append("#").append(",");
            return;
        }
        sb.append(root.val).append(",");
        build(root.left,sb);
        build(root.right,sb);
    }
    public TreeNode deserialize(String data) {
        if(data==null)return null;
        String[] nodes = data.split(",");
        LinkedList<String> list = new LinkedList<>();
        for (String node : nodes) {
            list.add(node);
        }
        return deBuild(list);
    }
    public TreeNode deBuild(LinkedList<String> list){
        String root = list.removeFirst();
        if(root.equals("#"))return null;
        TreeNode node = new TreeNode(Integer.parseInt(root));
        node.left  = deBuild(list);
        node.right  = deBuild(list);
        return node;
    }
}
