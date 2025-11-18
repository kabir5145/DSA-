package com.company;

public class Delete_Last_Node_SL {
    private ListNode head;

    private static class ListNode{
        private int number;
        private ListNode agla;

        public ListNode(int number){
            this.number = number;
            this.agla = null;
        }
    }

    //Printing the Singly Linked List
    public void print(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.number+"-->");
            current = current.agla;
        }
        System.out.println("null");
    }

    //Deleting first node in this list
    public ListNode deleteFirNode(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head  = head.agla;
        temp.agla = null;
        return temp;
    }

    //Deleting last node in this list
    public ListNode deleteLasNode(){
        if(head == null || head.agla == null){
            return head;
        }
        ListNode current = head;
        ListNode pre = null;
        while (current.agla != null){
            pre = current;
            current = current.agla;
        }
        pre.agla = null;
        return current;
    }
    public static void main(String[] args) {
        Delete_Last_Node_SL l = new Delete_Last_Node_SL();
        l.head = new ListNode(1);
        ListNode s = new ListNode(2);
        ListNode t = new ListNode(3);
        ListNode f = new ListNode(4);

        l.head.agla = s;
        s.agla = t;
        t.agla = f;

        //Displaying the Singly Linked List
        l.print();

        //Deleting first Node in Singly Linked List
        l.deleteFirNode();
        l.print();

        //Deleting last Node in Singly Linked List
        l.deleteLasNode();
        l.print();
    }
}
