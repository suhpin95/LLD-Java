package org.example.lru;

import java.util.HashMap;
import java.util.Map;

public class EvictionPolicy<K> {
    private DoublyLinkedList<K> doublyLinkedList;
    Map<K,DoublyLinkedList> retentionPolicy;

    public EvictionPolicy(){
        this.retentionPolicy = new HashMap<>();
        this.doublyLinkedList = new DoublyLinkedList<>();
    }

    public void addKey(K key){
        doublyLinkedList.addAtTail(key);
        retentionPolicy.put(key, doublyLinkedList);
    }
    public K evictKey(){
        return doublyLinkedList.getFirst();
    }
    public void addKey(K key, DoublyLinkedList list){
        this.retentionPolicy.put(key, list);
    }
}
