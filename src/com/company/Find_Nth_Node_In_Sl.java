package com.company;

public class Find_Nth_Node_In_Sl {
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

    //Finding the middle node
    public ListNode findMiddle(){
        if(head == null){
            return null;
        }
        ListNode sp = head;
        ListNode fp = head;

        while (fp != null && fp.next != null){
            sp = sp.next;
            fp = fp.next.next;
        }
        return sp;
    }

    //Finding the node from end of the list
    public ListNode findEndNode(int n){
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while (count < n){
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }
    public static void main(String[] args) {
        Find_Nth_Node_In_Sl n  = new Find_Nth_Node_In_Sl();
        n.head = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);

        n.head.next = a;
        a.next = b;

        n.printList();

        ListNode findM = n.findMiddle();
        System.out.println("The Middle node in this list is : "+findM.data);

        //Find the nth node from the end
        ListNode findNo = n.findEndNode(1);
        System.out.println("The second number from the end is : "+findNo.data);
    }
}
