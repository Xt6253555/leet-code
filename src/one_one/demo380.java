package one_one;

import java.util.*;

public class demo380 {
    Map<Integer, Integer> dict;
    List<Integer> list;
    Random rand = new Random();

    public demo380() {
        dict = new HashMap();
        list = new ArrayList();
    }

    public boolean insert(int val) {
        if (dict.containsKey(val)) return false;
        dict.put(val, list.size());
        list.add(list.size(),val);
        return true;
    }

    public boolean remove(int val) {
        if(!dict.containsKey(val))return false;
        // 先拿到 val 的索引
        int last = list.get(list.size() - 1);
        int idx = dict.get(val);
        //交换相应的元素
        list.set(idx,last);
        dict.put(last,idx);
        //删除对应元素
        list.remove(list.size()-1);
        dict.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}
