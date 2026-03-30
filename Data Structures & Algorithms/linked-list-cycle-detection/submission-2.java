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
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)return false;
        ListNode sl = head.next;
        ListNode fs = head.next.next;
        while(sl!=null && fs!=null){
            if(sl==fs)return true;
            sl=sl.next;
            fs = fs.next;
            if(fs!=null)fs = fs.next;
            
        }
        return false;
        
    }
}
