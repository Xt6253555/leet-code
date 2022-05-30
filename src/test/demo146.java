package test;

import java.util.LinkedHashMap;

public class demo146 {
    int cap;
    LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
    public demo146(int capacity) {
        this.cap=capacity;
    }

    public int get(int key) {
        if(!linkedHashMap.containsKey(key))return -1;
        makeRecent(key);
        return linkedHashMap.get(key);
    }

    public void put(int key, int value) {
        if(linkedHashMap.containsKey(key)){
            linkedHashMap.put(key,value);
            makeRecent(key);
            return;
        }
        if(linkedHashMap.size()>=cap){
            Integer next = linkedHashMap.keySet().iterator().next();
            linkedHashMap.remove(next);
        }
        linkedHashMap.put(key,value);
    }

    public void makeRecent(int key){
        Integer val = linkedHashMap.get(key);
        linkedHashMap.remove(key);
        linkedHashMap.put(key,val);
    }
}
