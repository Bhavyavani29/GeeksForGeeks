class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        int n = q.size();
        if(k > n) return q;
        Stack<Integer> st = new Stack<>();
		for(int i = 0; i < k; i++) 
		    st.push(q.poll());
		for(int i = 0; i < k; i++) 
		    q.offer(st.pop());
		for(int i = 0; i < n-k; i++) 
		    q.offer(q.poll());
		return q;
    }
}