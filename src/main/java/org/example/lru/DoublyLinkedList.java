package org.example.lru;

public class DoublyLinkedList<E> {
    Node<E> head;

    public DoublyLinkedList(){
        this.head = null;
    }
    public Node addAtHead(E val){
        if(head == null){
            head.next = new Node(val);
        }
        return null;
    }
    public Node addAtTail(E val){
        Node node = moveTillEnd();
        return node;
    }
    public Node moveTillEnd(){
        Node node = this.head;

        if(node == null){
            return new Node(-1);
        }
        while(node != null){
            node = node.next;
        }
        return node;
    }

    public E getFirst(){
        return this.head.getVal();
    }
    public Node deleteAtHead(){
        Node node = head;
        if(node == null){
            return null;
        } else {
            node = node.next;
            head.next = node;
        }
        return node;
    }
}
