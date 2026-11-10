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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0 || lists == null )return null;
        PriorityQueue <ListNode> pq = new PriorityQueue<>((a,b)-> a.val-b.val);
        for(ListNode n : lists){
            if(n!=null)pq.offer(n);
        }
        ListNode d = new ListNode(-1);
        ListNode cur = d;
        while(!pq.isEmpty()){
            ListNode smallest = pq.poll();
            cur.next = smallest;
            cur = cur.next;
            if(smallest.next!=null)pq.offer(smallest.next);

        }
        return d.next;
    }
}






/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode node : lists) {
            if (node != null)pq.add(node);            
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (!pq.isEmpty()) {
            ListNode smallest = pq.poll();
            current.next = smallest;
            current = current.next;
            if (smallest.next != null) pq.add(smallest.next);
        }
        return dummy.next;
    }
} */
