class Solution {
	public ArrayList<Integer> nextLargerElement(int[] arr) {
		// code here
		int n = arr.length;
		Stack<Integer> st = new Stack<>();
		int[] a = new int[n];
		a[n - 1] = -1;
		st.push(arr[n - 1]);
		for (int i = n - 2; i >= 0; i--) {
			int curr = arr[i];
			while (!st.isEmpty() && st.peek() <= curr)
				st.pop();
			if (st.isEmpty())
				a[i] = -1;
			else
				a[i] = st.peek();
			st.push(curr);
		}
		ArrayList<Integer> al = new ArrayList<>();
		for (int x : a)
			al.add(x);
		return al;
	}
}
