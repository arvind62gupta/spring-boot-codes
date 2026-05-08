package com.code.DS.doublyLinkedList;

public class TraverseData {

    public void forwardTraversal(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" ");
           temp = temp.next;
        }
        System.out.println();
    }
    public void backWardTraversal(Node tail){
        Node temp = tail;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
        System.out.println();
    }


}
