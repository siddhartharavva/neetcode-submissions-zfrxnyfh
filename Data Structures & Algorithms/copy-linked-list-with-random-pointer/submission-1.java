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
        Node h = head;
        HashMap <Node,Node> v = new HashMap<>();    
        while(h!=null){                        
            v.put(h,new Node(h.val));                        
            h = h.next;
        }
        h = head;
        while(h!=null){
            Node t = v.get(h);
            t.next = v.get(h.next);
            t.random =v.get(h.random);            
            h = h.next;
        }
        return v.get(head);
    }
}










/*class Solution {

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


*/