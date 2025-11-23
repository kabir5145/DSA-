package com.company;


public class Delete_Node_In_SL {
    private ListNode head;


    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Printing the Singly Linked List
    public void printList(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("Null");
    }

    //Finding length of Singly Linked List
    public int length(){
        int count = 0;
        ListNode current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    //Inserting Node at the beginning of singly linked list
    public void insertNodeAtFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    //Inserting Node at the end of singly linked list
    public void insertNodeAtEnd(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }

    //Insert a node at the given position in the singly linked list
    public void insertNode(int position , int data){
        ListNode node = new ListNode(data);
        if(position == 1){
            node.next = head;
            head = node;
        }else {
            ListNode previous = head;
            int count = 1;
            while (count < position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }
    }

    //Deleting first Node
    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    //Delete a node from a singly linked list at a given position
    public void deleteNode(int position){
        if(position == 1){
            head = head.next;
        }else {
            ListNode previous = head;
            int count = 1;
            while (count<position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }
    public static void main(String[] args) {
        Delete_Node_In_SL f = new Delete_Node_In_SL();
        f.head = new ListNode(90);
        ListNode s = new ListNode(91);
        ListNode t = new ListNode(92);
        ListNode fourth = new ListNode(93);

        f.head.next = s;
        s.next = t;
        t.next = fourth;

        //Printing it
        f.printList();
        System.out.println("The length of the singly linked list is : "+f.length());

        //Inserting node at the start
        f.insertNodeAtFirst(199);
        f.printList();

        //Inserting node at the end
        f.insertNodeAtEnd(299);
        f.printList();

        //Inserting a node in the list
        f.insertNode(3,1000);
        f.printList();

        //Deleting first Node
        f.deleteFirst();
        f.printList();

        //Deleting a Node in the list
        f.deleteNode(4);
        f.printList();
    }
}
