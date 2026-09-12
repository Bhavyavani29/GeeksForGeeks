class Solution {
	public ArrayList<Integer> sieve(int n) {
		// code here
		boolean[] isPrime = new boolean[n + 1];
		Arrays.fill(isPrime, true);
		if (n >= 0)
			isPrime[0] = false;
		if (n >= 1)
			isPrime[1] = false;
		for (int p = 2; p * p <= n; p++) {
			if (isPrime[p]) {
				for (int i = p * p; i <= n; i += p) {
					isPrime[i] = false;
				}
			}
		}
		ArrayList<Integer> primes = new ArrayList<>();
		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				primes.add(i);
			}
		}
		return primes;
	}
}
