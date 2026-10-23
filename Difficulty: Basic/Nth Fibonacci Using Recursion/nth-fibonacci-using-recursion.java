class Solution {
	static int nthFibonacci(int n) {
		// code here
		int a = 0;
		int b = 1;
		for (int i = 0; i<n; i++) {
			int next = a + b;
			a = b;
			b = next;
		}
		return a;
	}
}
