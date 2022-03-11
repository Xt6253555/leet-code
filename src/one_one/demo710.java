package one_one;

import java.util.*;

//黑名单中的随机数
public class demo710 {
    //[[7, [1，2, 3, 5]]]
    //[null, 0, 4, 1, 6, 1, 0, 4]
    Map<Integer,Integer> map;
    int l;
    Random random;

    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        demo710 demo710 = new demo710(7, arr);
        int pick = demo710.pick();
        System.out.println(pick);
    }
    public demo710(int n, int[] blacklist) {
        map = new HashMap<>();
        random = new Random();
        l = n-blacklist.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = l; i < n; i++) {
            set.add(i);//3456
        }
        for (int i : blacklist) {
            set.remove(i);//46
        }
        Iterator<Integer> iterator = set.iterator();
        for (int i : blacklist) {
            if (i<l){
                map.put(i,iterator.next());
            }
        }
    }

    public int pick() {
        int l = random.nextInt(this.l);
        return map.getOrDefault(l,l);
    }
}
