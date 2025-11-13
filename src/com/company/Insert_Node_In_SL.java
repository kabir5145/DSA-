package com.company;

public class Insert_Node_In_SL {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode (int data){
            this.data = data;
            this.next = null;
        }
    }

    //Printing the LinkedList
    public void printList(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    //Finding Length of this
    public int length(){
        if(head == null){
            return 0;
        }
        ListNode current = head;
        int count = 0;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    //Inserting Node at the fist
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    //Inserting Node at the last
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }

    //Inserting a node at the given position
    public void insert(int position , int value){
        // 1 --> 4 --> 5
        // 1 --> 6 --> 4 --> 5

        ListNode node = new ListNode(value);

        if(position == 1){
            node.next = head;
            head = node;
        }else{
            ListNode previous = head;
            int count = 1; //position-1
            while (count < position-1){
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }
    public static void main(String[] args) {
        Insert_Node_In_SL i = new Insert_Node_In_SL();
        i.head = new ListNode(12);
        ListNode sec = new ListNode(13);
        ListNode th = new ListNode(14);
        ListNode fth = new ListNode(15);

        //Connecting all the data
        i.head.next = sec;
        sec.next = th;
        th.next = fth;

        //Printing it
        i.printList();
        System.out.println("The length of this list is : "+i.length());

        //Inserting at first
        i.insertFirst(200);
        i.printList();

        //Inserting at last
        i.insertLast(300);
        i.printList();

        //Inserting at the given position
        i.insert(1,1200);
        i.insert(4,400);
        i.printList();
    }
}