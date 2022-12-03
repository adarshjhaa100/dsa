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

    public void setHead(Node head) {
        this.head = head;
    }

    public void traverse() {
        var current = this.head;
        System.out.println("Linked List: ");
        System.out.println(current);
        while(current != null) {
            System.out.printf("(node value: %s, hash: %H)->", current.getValue(), current.hashCode());
            current = current.next;
        }
        System.out.println();
    }

    public void insertBeg(String value) {
        var newNode = new Node(value);

        if(this.head == null) {
            this.head = newNode;
            return;
        }

        newNode.setNext(this.head);
        this.head = newNode;
    }

    public void insertEnd(String value) {
        var current = head;
        var newNode = new Node(value);

        // insert in case of empty list
        if(current == null) {
            this.setHead(newNode);
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

        list.insertBeg("all Started with: ");
        list.insertBeg("It");


        // traverse the linked list
        list.traverse();
    }
}
