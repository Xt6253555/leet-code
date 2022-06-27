package test;

import two_one.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//二叉搜索树中的众数
public class demo501 {
    List<Integer> list = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        if(root == null) return new int[0];
        List<Integer> res = find(root);
        for (int i = 0; i < res.size(); i++) {
            if(map.containsKey(res.get(i))) {
                map.put(res.get(i), map.get(res.get(i))+1);
            }else {
                map.put(res.get(i), 1);
            }
        }
        int max = Integer.MIN_VALUE;
        int val = 0;
        for(Integer a: map.keySet()){
            if(max<= map.get(a)){
                max= map.get(a);
                val = a;
            }
        }
        list.add(val);
        map.remove(val);
        for(Integer a: map.keySet()){
            if(max== map.get(a)){
                list.add(a);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
    public  List<Integer> find(TreeNode root){
        if (root == null)return list;
        list.add(root.val);
        find(root.left);
        find(root.right);
        return list;
    }
}
