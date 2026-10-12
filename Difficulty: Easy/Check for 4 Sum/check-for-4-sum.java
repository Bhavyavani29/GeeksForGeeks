class Solution {
	public boolean fourSum(int[] arr, int x) {
		// code here
		HashSet<Integer> hs = new HashSet<>();
		int n = arr.length;
		if (n < 4)
			return false;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int currSum = arr[i] + arr[j];
				int complement = x - currSum;
				if (hs.contains(complement)) {
					return true;
				}
			}
			for (int k = 0; k < i; k++) {
				hs.add(arr[k] + arr[i]);
			}
		}
		return false;
		
		/*ArrayList<Integer> al = new ArrayList<>();
		for (int num : arr) {
			al.add(num);
		}
		for (int i = 0; i < arr.length; i++) {
			int remain = x - arr[i];
			if (al.contains(remain)) {
				return true;
			}
		}
		return false; */
	}
}
