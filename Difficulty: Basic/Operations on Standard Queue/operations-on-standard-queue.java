class Solution {
    public void enqueue(Queue<Integer> q, int x) {
        // code here
        q.add(x);
    }

    public void dequeue(Queue<Integer> q) {
        
        // code here
        if(!q.isEmpty()){
            q.remove();
        }
    }

        
    public int front(Queue<Integer> q) {
        // code here
        return q.peek();
    }
        

    public boolean find(Queue<Integer> q, int x) {
        // code here
        return q.contains(x);
    }
}