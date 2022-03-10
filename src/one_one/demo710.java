package one_one;

import java.util.*;

//黑名单中的随机数
public class demo710 {
    //[[7, [2, 3, 5]]]
    //[null, 0, 4, 1, 6, 1, 0, 4]
    Map<Integer, Integer> m;
    Random r;
    int len;

    public demo710(int n, int[] blacklist) {
        m = new HashMap<>();
        r = new Random();
        len = n - blacklist.length;//4
        Set<Integer> set = new HashSet<>();
        for (int i = len; i < n; i++) set.add(i);//456
        for (int x : blacklist) set.remove(x);//46
        Iterator<Integer> iterator = set.iterator();
        for (int x : blacklist)
            if (x < len)
                m.put(x, iterator.next());//{2,4}{3,6}
    }

    public int pick() {
        int k = r.nextInt(len);
        return m.getOrDefault(k, k);
    }
}
