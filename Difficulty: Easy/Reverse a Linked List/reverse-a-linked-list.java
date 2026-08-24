/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        if(head.next == null){
            return head;
        }
        else{
            Node cur = head;
            Node p = head.next;
            Node nxt = head.next;
            cur.next = null;
            while(p.next != null){
                nxt = p.next;
                p.next = cur;
                cur = p;
                p = nxt;
            }
            p.next = cur;
            head = p;
            }
            return head;
    }
}