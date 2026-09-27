class Solution {
	public int totalCuts(ArrayList<Integer> a, int k) {
		// code here
		int n = a.size();
		if (n < 2) {
			return 0;
		}
		int[] rightMin = new int[n];
		rightMin[n - 1] = a.get(n - 1);
		for (int i = n - 2; i >= 0; i--) {
			rightMin[i] = Math.min(a.get(i), rightMin[i + 1]);
		}
		int count = 0;
		int leftMax = Integer.MIN_VALUE;
		for (int i = 0; i < n - 1; i++) {
			leftMax = Math.max(leftMax, a.get(i));
			int currentRightMin = rightMin[i + 1];
			if (leftMax + currentRightMin >= k) {
				count++;
			}
		}
		return count;
	}
}
