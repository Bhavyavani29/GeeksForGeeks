class Solution {
	public boolean pairWiseConsecutive(Stack<Integer> st) {
		// code here
		if (st.isEmpty())
			return true;
		
		Stack<Integer> temp = new Stack<>();
		boolean res = true;
		
		// If odd number of elements, remove the top one
		if (st.size() % 2 != 0) {
			st.pop();
		}
		
		while (!st.isEmpty()) {
			int first = st.pop();
			int second = st.pop();
			
			if (Math.abs(first - second) != 1) {
				res = false;
			}
			
			// store the elements to restore later
			temp.push(second);
			temp.push(first);
		}
		
		// restore original stack
		while (!temp.isEmpty()) {
			st.push(temp.pop());
		}
		return res;
	}
}
