package com.code.DS.linkedlist;

public class RunnerMain {
    public static void main(String[] args){
        CreateLinkedList createLinkedList = new CreateLinkedList();
        createLinkedList.insert(4);
        createLinkedList.insert(10);
        createLinkedList.insert(8);
        createLinkedList.insert(12);

//insert element at start in list
        createLinkedList.insertElementAtStart(25);
        createLinkedList.insertAt(4,20);
        createLinkedList.deleteAt(3);

        createLinkedList.show();

    }

}
