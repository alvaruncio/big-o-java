package ExercisesDataStructures.LinkedListsExercises;

import java.util.List;

public class SortListMerge {


    public static void main(String[] args) {

        SortListMerge solution = new SortListMerge();

        // Caso 1
        ListNode head1 = new ListNode(4,
                new ListNode(2,
                        new ListNode(1,
                                new ListNode(3))));

        // Caso 2
        ListNode head2 = new ListNode(-1,
                new ListNode(5,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(0)))));

        // Caso 3
        ListNode head3 = new ListNode(2,
                new ListNode(1));

        // Caso 4
        ListNode head4 = new ListNode(3,
                new ListNode(1,
                        new ListNode(2)));

        // Caso 5
        ListNode head5 = new ListNode(7);

        solution.sortList(head1);
    }


      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode sortList(ListNode head){

        if(head.next == null){
            return head;
        }

        int length = 0;
        ListNode current = head;

        while (current != null){
            length++;
            current = current.next;
        }

        int middle = length / 2;

        current = head;
        ListNode leftHead = null;
        ListNode rightHead = null;
        for (int i = 1; i <= middle; i++) {
            if(i == middle){
                rightHead = current.next;
                current.next = null;
                leftHead = head;
                break;
            }
            current = current.next;
        }





        ListNode sortedLeft = sortList(leftHead);
        ListNode sortedRight = sortList(rightHead);

        return merge(sortedLeft, sortedRight);

    }

    private ListNode merge(ListNode leftHead, ListNode rightHead) {
        ListNode head = null;
        ListNode sortedMerge = null;
        while (leftHead != null && rightHead != null){
            if(leftHead.val < rightHead.val){
                if(sortedMerge == null){
                    head = leftHead;
                    sortedMerge = leftHead;
                }else{
                    sortedMerge.next = leftHead;
                }

                leftHead = leftHead.next;
            }else {
                if(sortedMerge == null){
                    head = rightHead;
                    sortedMerge = rightHead;
                }else{
                    sortedMerge.next = rightHead;
                }
                rightHead = rightHead.next;
            }

            sortedMerge = sortedMerge.next;


        }

        if(leftHead != null){
            sortedMerge.next = leftHead;
        }

        if(rightHead != null){
            sortedMerge.next = rightHead;
        }

        return head;



    }


}

