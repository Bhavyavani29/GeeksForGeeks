class Solution {
	public List<List<Integer>> findTriplets(int[] arr) {
		// Your code here
		int n = arr.length;
		List<List<Integer>> res = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = i + 2; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0 && i < j && j < k) {
						List<Integer> al = new ArrayList<>();
						al.add(i);
						al.add(j);
						al.add(k);
						res.add(al);
					}
				}
			}
		}
		return res;
	}
}
