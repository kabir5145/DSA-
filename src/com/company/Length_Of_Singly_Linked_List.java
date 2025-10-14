package com.company;

public class Length_Of_Singly_Linked_List {
    private ListNode head;

    private static class ListNode {
        private int data;// Can be a generic type
        private ListNode next;// Reference to next ListNode in list

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Method to print the linked list
    public void display() {
        Length_Of_Singly_Linked_List.ListNode current = head; // Start from head
        while (current != null) { // Traverse until null
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null"); // End of list
    }

    public int lengh(){
        if(head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Length_Of_Singly_Linked_List l = new Length_Of_Singly_Linked_List();
        l.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        l.head.next = second;
        second.next = third;
        third.next = fourth;

        l.display();
        System.out.println("The length of the Singly Linked List is : "+l.lengh());
    }
}
