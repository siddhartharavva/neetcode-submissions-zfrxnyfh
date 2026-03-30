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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        int l = 0;
        while(p!=null){
            p = p.next;           
            l++;
        }
        if(n==l)return head.next;
        
        int i = 0;
        ListNode p1 = head;
        
        System.out.print(l);
        System.out.print(n);
        while(i<l-n-1){
            p1 = p1.next;
            i++;
            System.out.print(i);
            System.out.print(" ");
            System.out.println(p1.val);
        }
        System.out.print(" ");
        System.out.println(p1.val);
        p1.next = p1.next.next;
        return head;
        
    }
}
