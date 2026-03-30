class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode t = head;
        int n = 0;
        while (t != null) {
            n++;
            t = t.next;
        }
        ListNode curr = head;
        for (int i = 0; i < n/2; i++)curr = curr.next;

        ListNode head2 = curr.next;
        curr.next = null;
        // Step 4: reverse second half safely
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
}