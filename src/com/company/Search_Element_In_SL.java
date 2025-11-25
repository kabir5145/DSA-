package com.company;

public class Search_Element_In_SL {
    private ListNode head;

    //Formation of singly linked list
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Printing the Singly Linked list
    public void printLL(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+"-->");
            current  = current.next;
        }
        System.out.println("null");
    }

    //Searching element in a Singly Linked List
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

    //Finding Length of singly linked list
    public int length(){
        int count = 0 ;
        ListNode current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    //Inserting node at the beginning of the Singly linked list
    public void insertNodeFir(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    //Inserting Node at the last of the Singly Linked List
    public void insertNodeLas(int value){
        ListNode newNode = new ListNode(value);
        if(head == null ){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }
    public static void main(String[] args) {
        Search_Element_In_SL s = new Search_Element_In_SL();
        s.head = new ListNode(1);
        ListNode  a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);

        s.head.next = a2;
        a2.next = a3;
        a3.next = a4;

        s.printLL();

        //Searching an element in this singly linked list
        System.out.println("Searching the element 1 in this list : "+s.searchElement(1));

        //Length of this list
        System.out.println("The length of this singly linked list is : "+s.length());

        //Inserting node at the first
        s.insertNodeFir(100000);
        s.printLL();

        //Inserting Node at the last in this list
        s.insertNodeLas(200000);
        s.printLL();
    }
}
