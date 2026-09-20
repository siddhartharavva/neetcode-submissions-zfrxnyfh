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
        if (head == null || head.next == null) return;
        ListNode m = head;
        ListNode mdup = head;
        while(mdup.next!=null && mdup.next.next!=null){
            m=m.next;
            mdup=mdup.next.next;
            
        }
        ListNode r = null;
        ListNode c = m.next;
        m.next = null;
        while(c!=null){
            ListNode t = c.next;
            c.next = r;
            r = c;
            c = t;
        }
        
        c = head;
        while(c!=null && r!=null){    
            ListNode t = c.next;            
            c.next = r;
            r = r.next;         
            c.next.next = t;
            c = t ;
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