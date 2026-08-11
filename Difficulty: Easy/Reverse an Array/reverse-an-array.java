class Solution {
	public void reverseArray(int arr[]) {
		// code here
		int n = arr.length;
		Stack <Integer> st = new Stack<>();
		for (int i = 0; i < n; i++) {
			st.push(arr[i]);
		}
		for (int i = 0; i < n; i++) {
			arr[i] = st.pop();
		}
	}
}
