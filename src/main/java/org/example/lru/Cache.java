package org.example.lru;

public class Cache<K,V> {
    private final Storage<K, V> storage;
    // focus on Eviction policy
    private final EvictionPolicy<K> policy;
    int capacity;
    public Cache(int capacity){
        this.capacity = capacity;
        storage = new Storage<>();
        policy = new EvictionPolicy();
    }
    public V put(K key, V val) throws Exception {
        if(storage.getSize() > capacity){
            K evictKey = policy.evictKey();
            storage.delete(evictKey);
        }
        this.policy.addKey(key);
        return storage.put(key, val);
    }
    public V get(K key){
        policy.evictKey();
        policy.addKey(key);
        return storage.get(key);
    }
    public V delete(K key){
        return storage.delete(key);
    }
}
