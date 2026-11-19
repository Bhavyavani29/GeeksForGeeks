class Solution {
	public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
		// code here
		int n = arr.length;
		int[]s = new int[n];
		ArrayList<Integer>ans = new ArrayList(queries.length);
		s[0] = arr[0];
		for (int i = 1; i <= n - 1; i++) {
			s[i] = s[i - 1]+arr[i];
		}
		for (int i = 0; i<queries.length; i++) {
			int l = queries[i][0];
			int r = queries[i][1];
			int b = r - l + 1;
			int sum = 0;
			if (l>0)
				sum = s[r]-s[l - 1];
			else
				sum = s[r];
			ans.add(sum/b);
		}
		return ans;
	}
}
