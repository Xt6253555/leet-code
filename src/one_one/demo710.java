package one_one;

import java.util.*;

//黑名单中的随机数
//[7, [2, 3, 5]
//0,1,4,6
public class demo710 {
    Map<Integer, Integer> map;
    Random r;
    int len;

    public demo710(int n, int[] blacklist) {
        int len = n-blacklist.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = len; i < n; i++) {
            set.add(i);//4,5,6
        }
        for (int i = 0; i < blacklist.length; i++) {
            set.remove(blacklist[i]);//4,6
        }
        //映射2->4,3->6
        Iterator<Integer> iterator = set.iterator();
        for (int x : blacklist) {
            if(x<len)map.put(x,iterator.next());
        }
    }

    public int pick() {
        int i = r.nextInt(len);
        return map.getOrDefault(i,i);
    }
}
