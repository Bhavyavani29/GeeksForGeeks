class Solution {
	public int count(int l, int r) {
		boolean[] isPrime = new boolean[r + 1];
		for (int i = 2; i <= r; i++) {
			isPrime[i] = true;
		}
		for (int i = 2; i * i <= r; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= r; j += i) {
					isPrime[j] = false;
				}
			}
		}
		int pCount = 0;
		int cCount = 0;
		for (int i = l; i <= r; i++) {
			if (isPrime[i]) {
				pCount++;
			}
			else if (i > 1) {
				cCount++;
			}
		}
		return cCount - pCount;
	}
}
