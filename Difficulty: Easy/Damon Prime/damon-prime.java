class Solution {
	public boolean damonPrime(int n) {
		// Code here
		if (isPrime(n - 1) && isPrime(n + 1))
			return true;
		else
			return false;
	}
	public static boolean isPrime(int N) {
		if (N <= 1)
			return false;
		if (N == 2 || N == 3)
			return true;
		if (N%2 == 0 || N%3 == 0)
			return false;
		for (int i = 5; i*i <= N; i = i + 6) {
			if ((N%i == 0) || (N%(i + 2) == 0))
				return false;
		}
		return true;
	}
}
