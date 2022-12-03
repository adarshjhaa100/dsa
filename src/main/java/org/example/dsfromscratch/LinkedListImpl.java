package org.example.dsfromscratch;

class Node {
    String value;
    Node next;

    public Node(String value) {
        this.value = value;
        this.next = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class LinkedListImpl {
    Node head;

    public LinkedListImpl(){
        this.head = null;
    }

    public void traverse() {
        var current = this.head;
        System.out.println("Linked List: ");
        System.out.println(current);
        while(current!=null) {
            System.out.printf("(node value: %s, hash: %H)->", current.value, current.value);
            current = current.next;
        }
        System.out.println();
    }

    public void insertEnd(String value) {
        var current = head;
        var newNode = new Node(value);

        // insert in case of empty list
        if(current == null) {
            this.head = newNode;
            return;
        }

        // traverse to the end
        while(current.next!=null) {
            current = current.next;
        }
        // Insert at end
        current.next = newNode;
    }

    public static void listUse() {
        LinkedListImpl list = new LinkedListImpl();
        // traverse the linked list
        list.traverse();

        list.insertEnd("hello");
        list.insertEnd("world");
        list.insertEnd("quick brown");
        // traverse the linked list
        list.traverse();

        list.insertEnd("fox");
        list.insertEnd("jumped");
        list.insertEnd("over the lazy dawg");

        // traverse the linked list
        list.traverse();
    }



}
