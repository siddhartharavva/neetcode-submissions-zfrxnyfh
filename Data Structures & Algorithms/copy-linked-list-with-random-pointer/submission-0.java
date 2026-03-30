/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        HashMap <Node, Node> v = new HashMap<>();
        Node t = head;
        while(t!=null){
            v.put(t, new Node(t.val));
            t = t.next;
        }
        t = head;
        while(t!=null){
            Node copy = v.get(t);
            copy.next = v.get(t.next);
            copy.random = v.get(t.random);
            t = t.next;
        }

        return v.get(head);
    }
}








