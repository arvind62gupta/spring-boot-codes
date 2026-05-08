package com.code.DS.doublyLinkedList;

public class DoublyMain {
    public static void main(String[] args){

        Node head =new Node(5);
        Node second = new Node(8);
        Node third = new Node(7);
        Node fourth = new Node(12);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev =third;

        TraverseData test = new TraverseData();

        System.out.println("forward traversal");
        test.forwardTraversal(head);

        System.out.println("backward traversal");
        test.backWardTraversal(fourth);


        Logic logic =  new Logic();
        logic.insert(6);
        logic.insert(8);
        logic.insert(7);
        logic.insert(20);
        logic.insert(18);
        logic.insert(9);
        logic.insert(18);
        logic.insertNodeAtStart(10);
        logic.insertNodeAtLast(12);
        logic.insertNodeAtPosition(5,22);
        logic.display();
    }
}
