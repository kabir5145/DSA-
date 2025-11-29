package com.company;


public class Find_Middle_Node_Sl {
    private  ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Printing the Singly Linked List
    public void print(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("Null");
    }

    //Middle of Singly Linked List
    public ListNode middle(){
        if(head == null){
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null ){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }


    public static void main(String[] args) {
        Find_Middle_Node_Sl r = new Find_Middle_Node_Sl();
        r.head = new ListNode(1);
        ListNode s = new ListNode(2);
        ListNode t = new ListNode(3);

        // Connecting the singly linked list
        r.head.next = s;
        s.next = t;

        r.print();

        //Finding the Middle one
        ListNode middleNode = r.middle();
        System.out.println("The Middle node is : "+middleNode.data);

    }
}
