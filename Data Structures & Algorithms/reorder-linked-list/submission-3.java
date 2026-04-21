/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode sl = head;
        ListNode fs = head;           
        while(fs!= null && fs.next!=null){
            sl = sl.next;
            fs = fs.next.next;            
        }
        ListNode head2 = sl.next;
        ListNode head1 = head;
        sl.next = null;
        ListNode prev = null;
        ListNode curr = head2;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        head2 = prev; 

        while (head1 != null && head2 != null) {
            ListNode temp1 = head1.next;
            ListNode temp2 = head2.next;

            head1.next = head2;

            if (temp1 == null) break; 

            head2.next = temp1;

            head1 = temp1;
            head2 = temp2;
        }

        
    }
}




/*class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;
        ListNode prev = null;
        while (head2 != null) {
            ListNode next = head2.next;
            head2.next = prev;
            prev = head2;
            head2 = next;
        }

        head2 = prev;        
        ListNode head1 = head;

        while (head2 != null) {
            ListNode temp1 = head1.next;
            ListNode temp2 = head2.next;

            head1.next = head2;
            head2.next = temp1;

            head1 = temp1;
            head2 = temp2;
        }
    }
}*/