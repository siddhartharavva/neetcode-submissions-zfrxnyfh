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
        
        ListNode len = head;
        int l = 0;
        while(len!=null){
            l++;
            len=len.next;
        }        
        if(n==l)return head.next;        

        int s = l-n;
        int t = 0;
        ListNode p = head;
        while(t<s-1){
            t++;
            p = p.next;
        }
        p.next=p.next.next;

        return head;

    }
}












/*class Solution {
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
        while(i<l-n-1){
            p1 = p1.next;
            i++;        
        }    
        p1.next = p1.next.next;
        return head;
        
    }
}
*/