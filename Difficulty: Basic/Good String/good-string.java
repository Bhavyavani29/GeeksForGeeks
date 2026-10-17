class Solution {
	public boolean isGoodString(String s) {
		// code here
		int n = s.length();
		if (n == 1)
			return true;
		for (int i = 1; i < n; i++) {
			int diff = Math.abs((int)s.charAt(i) - (int)s.charAt(i - 1));
			int mind = Math.min(diff, 26 - diff);
			if (mind != 1) {
				return false;
			}
		}
		return true;
	}
}
