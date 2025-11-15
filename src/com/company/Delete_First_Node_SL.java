package com.company;

public class Delete_First_Node_SL {
    private Node head;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Printing the singly linked list.
    public void printSinglyLinkedList(){
        Node current = head;
        while (current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }

    //Deleting a node in this list
    public void insertNode(int position ,int value){

        Node num = new Node(value);
        if( position == 1){
            num.next = head;
            head = num;
        }else {
            Node pre = head;
            int count = 1;
            while (count<position - 1){
                pre = pre.next;
                count++;
            }
            Node current = pre.next;
            pre.next = num;
            num.next = current;
        }
    }
    public Node deleteFirstNode(){
        if (head == null){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }
    public static void main(String[] args) {
        Delete_First_Node_SL d = new Delete_First_Node_SL();
        d.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        d.head.next = second;
        second.next = third;
        third.next = fourth;

        d.printSinglyLinkedList();

        d.insertNode(1,100);
        d.insertNode(4,44);
        d.printSinglyLinkedList();

        d.deleteFirstNode();
        d.printSinglyLinkedList();
    }
}
