package org.example.lru;

public class Node<E> {
    Node prev, next;
    E val;

    public Node(E val){
        this.val = val;
        this.prev = null;
        this.next = null;
    }

    public E getVal() {
        return val;
    }
}
