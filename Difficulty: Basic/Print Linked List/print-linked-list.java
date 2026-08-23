/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        while(head != null){
            result.add(head.data);
            head = head.next;
        }
        return result;
    }
}