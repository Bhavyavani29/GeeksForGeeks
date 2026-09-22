class Solution {
	public int binarySubstring(String s) {
		// code here
		int n = s.length();
		int count = 0;
		for (int i = 0; i<n; i++) {
			if (s.charAt(i) == '1') {
				count++;
			}
		}
		int sum = 0;
		count--;
		while (count>0) {
			sum += count;
			count--;
		} return sum;
	}
}
