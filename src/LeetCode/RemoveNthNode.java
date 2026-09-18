package LeetCode;

import java.util.List;

public class RemoveNthNode {

     public static class ListNode {
         int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }


    public static void main(String[] args) {

        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode resultado = removeNthFromEnd(node1, 2);

        System.out.println(resultado);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n){
         int contadorNodosTotal = 0;
         ListNode current = head;
         while (current != null ){
             contadorNodosTotal++;
             current = current.next;
         }

         current = head;
         int contadorNodos = 0;

         ListNode previous = null;

         while (current != null){
             contadorNodos++;
             if(contadorNodos == contadorNodosTotal - (n - 1)){
                 if(previous == null && current.next == null){
                     head = null;
                     return head;
                 }

                 if(previous == null && current.next != null){
                     head = current.next;
                     return head;
                 }

                 if(previous != null){
                     previous.next = current.next;
                     return head;
                 }
             }
             previous = current;
             current = current.next;
         }

        return head;

    }



}
