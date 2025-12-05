package com.company;


public class Remove_Duplicate_In_Sorted_Sl {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    //Printing the singly linked list
    public void printList(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }

    //Removing the duplicates from the singly linked list
    public void removeDuplicate(){
        ListNode current = head;
        while (current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
    }
    public static void main(String[] args) {
        Remove_Duplicate_In_Sorted_Sl r = new Remove_Duplicate_In_Sorted_Sl();
        r.head = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);

        r.head.next = a;
        a.next = b;
        b.next = c;

        //Printing the list
        r.printList();

        //Removing the duplicates from the list
        r.removeDuplicate();
        r.printList();
    }
}
