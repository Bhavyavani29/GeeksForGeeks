class Solution {
	static int heapHeight(int n, int arr[]) {
		// code here
		if (n == 1) {
			return 1;
		}
		return 31 - Integer.numberOfLeadingZeros(n);
	}
}
