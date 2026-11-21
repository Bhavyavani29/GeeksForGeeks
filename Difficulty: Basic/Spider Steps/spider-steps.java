class Solution {
	public int minStep(int h, int u, int d) {
		// code here
		if (u >= h) {
			return 1;
		}
		int netClimb = u - d;
		int remainingHeight = h - u;
		int stepsBeforeLast = (remainingHeight + netClimb - 1) / netClimb;
		return stepsBeforeLast + 1;
	}
}
