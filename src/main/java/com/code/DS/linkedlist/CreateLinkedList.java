package com.code.DS.linkedlist;

public class CreateLinkedList {

    Node head;
    public void insert(int insertData){
        Node node = new Node();
        node.data = insertData;
        node.next= null;

        if(head ==null){
            head = node;
        }else {
            Node node1= head;
            while(node1.next!=null){
                node1 = node1.next;
            }
                node1.next = node;
        }
    }
    public void insertElementAtStart(int data){
        Node node = new Node();
        node.data=data;

        node.next = head;
        head = node;
    }
    public void insertAt(int index,int data){
        Node node = new Node();
        node.data=data;
        node.next = null;

        if(index==0){
           // insertElementAtStart(data);
            node.next = head;
            head = node;
        }else {
            Node nodeTravel = head;
            for (int i = 0; i < index - 1; i++) {
                nodeTravel = nodeTravel.next;
            }
            node.next = nodeTravel.next;
            nodeTravel.next = node;
        }
    }
    public void deleteAt(int index){
        if(index==0){
            head= head.next;
        }else{
            Node temp = head;
            Node prev = null;

            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            prev = temp.next;
            temp.next = prev.next;

        }

    }
    public void show(){

        Node addNode = head;
        while(addNode.next!=null){
            System.out.println(addNode.data);
            addNode=addNode.next;
        }
        System.out.println(addNode.data);
    }
}

