/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // Code here
        Node newNode = new Node(x);
        if (head == null) {
            return newNode;
        }
        int count = 0;
        Node p = head;
        while (p != null) {
            count++;
            p = p.next;
        }
        int mid = count%2 == 0? (count / 2) : ((count + 1)/2);
        p = head;
        for (int i = 1; i < mid; i++) {
            p = p.next;
        }
        newNode.next = p.next;
        p.next = newNode;
        return head;
    }
}