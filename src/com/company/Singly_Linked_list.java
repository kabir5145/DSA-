package com.company;

public class Singly_Linked_list {
    private ListNode head;

    private static class ListNode{
        private int data; //Generic Type
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Method to print the linked list
    public void display() {
        ListNode current = head; // Start from head
        while (current != null) { // Traverse until null
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null"); // End of list
    }

    public static void main(String[] args) {
        Singly_Linked_list sll = new Singly_Linked_list();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        //Now we will connect them together to form a chain
        sll.head.next = second; // 10 --> 1
        second.next = third; // 10 --> 1 --> 8
        third.next = fourth; // 10 --> 1 --> 8 --> 11 --> null

        //Print the list
        sll.display();
    }
}
