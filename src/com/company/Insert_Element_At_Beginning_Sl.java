package com.company;


public class Insert_Element_At_Beginning_Sl {

    ListNode head;

    private static class ListNode {
        private int data; // Can be a generic type
        private ListNode next; // Reference to next ListNode in list

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current= current.next;
        }
        System.out.println("null");
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
    public static void main(String[] args) {
        Insert_Element_At_Beginning_Sl s = new Insert_Element_At_Beginning_Sl();
        s.insertFirst(11);
        s.insertFirst(12);
        s.insertFirst(8);
        s.display();
    }
}
