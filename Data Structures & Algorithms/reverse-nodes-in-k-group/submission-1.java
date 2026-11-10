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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1)return head;
        int c = 0;
        ListNode cur = head;
        while(c<k && cur!=null){
            cur=cur.next;
            c++;
        }
        if(c<k)return head;
        c = 0;
        ListNode prev = null;        
         cur = head;        
        while(c<k){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;   
            c++;         
        }
        head.next = reverseKGroup(cur,k);
        return prev;
    }
}






















/*
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1 )return head;
        ListNode curr = head;
        int count = 0;
        while(curr!=null && count<k){
            curr = curr.next;
            count++;
        }
        if (count < k) return head; 

        count = 0;
        ListNode prev = null;
        curr = head;
        while(count < k){
            ListNode nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;            
            count++;
        }
        head.next = reverseKGroup(curr,k);
        return prev;               
    }
}








*/