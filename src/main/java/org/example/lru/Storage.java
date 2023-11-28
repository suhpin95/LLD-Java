package org.example.lru;


import java.util.HashMap;
import java.util.Map;

public class Storage<K, V>{
    Map<K, V> hashMap = new HashMap<>();

    public V put(K key, V val){
        return hashMap.put(key, val);
    }
    public V get(K key){
        return hashMap.get(key);
    }
    public V delete(K key){
        if(hashMap.containsKey(key)){
            return hashMap.remove(key);
        }
        return null;
    }

    public int getSize(){
        return hashMap.size();
    }


}
