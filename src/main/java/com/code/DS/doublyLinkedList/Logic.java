package com.code.DS.doublyLinkedList;

public class Logic {

    Node head;
    Node tail;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
            head.prev = null;
            tail.next = null;
        }else{
           tail.next = newNode;
           newNode.prev = tail;
           tail = newNode;
           tail.next = null;
        }

    }
    public void insertNodeAtStart(int data) {
        Node newNode = new Node(data);
        head.prev = newNode;
        newNode.next = head;
        newNode.prev = null;
        head= newNode;
        System.out.println("new node add at start "+newNode.data);
    }
    public void insertNodeAtLast(int data){
        Node newNode = new Node(data);
        tail.next = newNode;
        newNode.prev =tail;
        newNode.next =null;
        tail = newNode;
        System.out.println("new node add at last "+ newNode.data);
    }
    public void insertNodeAtPosition(int indexPos,int data){
        Node newNode =new Node(data);
       Node current = head;
       Node temp = null;
       for(int i=1;i<indexPos-1;i++){
           current = current.next;
       }
       temp = current.next;
       temp.prev =current;
       current.next =newNode;
       newNode.prev =current;
       newNode.next = temp;
       temp.prev =newNode;
       System.out.println("index posion == "+indexPos+ "new node to add ==> "+newNode.data);
    }

    public void display() {
        Node current = head;
        System.out.println("create list ");
        while(current != null){
           System.out.print(current.data + " ");
           current= current.next;
        }
    }
}
