package com.company;


public class Insert_Node_At_End_Sl {
    private ListNodes head;

    private class ListNodes {
        private int data;
        private ListNodes next;

        public ListNodes(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Method to print Singly Linked List
    public void display(){
        ListNodes current = head;
        while (current != null){
            System.out.print(current.data+"-->");
            current= current.next;
        }
        System.out.println("null");
    }

    //Insert a Node at the end of a Singly Linked List
    public void insertAtEnd(int value){
        ListNodes newNode = new ListNodes(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNodes current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }
    public static void main(String[] args) {
       Insert_Node_At_End_Sl i = new Insert_Node_At_End_Sl();
        i.head = i.new ListNodes(1);
        i.head.next = i.new ListNodes(2);
        i.head.next.next = i.new ListNodes(3);

        i.display();

        i.insertAtEnd(11);
        i.display();
    }
}
