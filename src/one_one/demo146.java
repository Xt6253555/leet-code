package one_one;
import java.util.LinkedHashMap;

//LRU缓存
public class demo146 {
    static LinkedHashMap<Integer,Integer> cache = new LinkedHashMap<>();
    int cap;

    public static void main(String[] args) {
        cache.put(1,4);
        cache.put(2,5);
        cache.put(3,5);
        cache.remove(2);
        System.out.println(cache);
    }
    public demo146(int capacity) {
        this.cap = capacity;
    }

    public int get(int key) {
        if(!cache.containsKey(key))return -1;
        //存在，取值，并且更新为最近使用的
        update(key);
        return cache.get(key);
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)){
            cache.put(key,value);
            //存在，更新值，并且更新为最近使用的
            update(key);
            return;
        }
        if(this.cap<=cache.size()){
            // 链表头部就是最久未使⽤的 key
            int oldKey = cache.keySet().iterator().next();
            cache.remove(oldKey);
        }
        cache.put(key, value);
    }
    public void update(int key){
        int val = cache.get(key);
        //删除队头的key
        cache.remove(key);
        //插入队尾
        cache.put(key,val);
    }
}
