class Solution {
	public int[] prefixAvg(int[] arr) {
		// code here
		int result[] = new int[arr.length];
		int sum = 0;
		for (int i = 0; i<arr.length; i++) {
			sum = sum + arr[i];
			result[i] = (sum/(i + 1));
		}
		return result;
	}
}
