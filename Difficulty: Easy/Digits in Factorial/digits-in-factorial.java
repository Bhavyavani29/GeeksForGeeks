class Solution {
	public int digitsInFactorial(int n) {
		// code here
		if (n <= 1) {
			return 1;
		}
		double logSum = 0;
		for (int i = 1; i <= n; i++) {
			logSum += Math.log10(i);
		}
		return (int) Math.floor(logSum) + 1;
	}		
}
