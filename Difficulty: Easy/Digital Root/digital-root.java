class Solution {
	public int digitalRoot(int n) {
		// code here
		
		if (n < 10)
			return n;
		while (n >= 10) {
			int sum = 0;
			while (n > 0) {
				int r = n % 10;
				sum += r;
				n = n / 10;
			}
			n = sum;
		}
		return n;
	}
};
