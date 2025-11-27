package com.company;


public class Reverse_SL {
    private ListNode head;

    //Forming a Singly Linked List
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Printing singly linked list
    public void print(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }

    //Reverse Singly Linked List
    public static ListNode reverseSL(ListNode head){
        if(head == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    //Search an element in singly linked list
    public boolean searchElement(int searchKey){
        ListNode current = head;
        while (current != null){
            if(current.data == searchKey){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Reverse_SL r = new Reverse_SL();
        r.head = new ListNode(1);
        ListNode s = new ListNode(2);
        ListNode t = new ListNode(3);

        // Connecting the singly linked list
        r.head.next = s;
        s.next = t;

        r.print();

        //Searching an element in singly linked list
        System.out.println("Is there 1 in the list : "+r.searchElement(1));

        r = r.reverseSL();
        r.print();
    }
}
