class Solution {
	public int countWays(int n) {
		// code here
		if (n == 1)
			return 1;
		else if (n == 2)
			return 2;
		else
			return countWays(n - 1) + countWays(n - 2);
	}
}
