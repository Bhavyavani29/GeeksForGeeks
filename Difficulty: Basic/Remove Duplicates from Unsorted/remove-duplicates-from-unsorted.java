class Solution {
	static ArrayList<Integer> removeDuplicate(int arr[]) {
		// code here
		ArrayList<Integer> result = new ArrayList<>();
		HashSet<Integer> hs = new HashSet<>();
		for (int num : arr) {
			if (!hs.contains(num)) {
				hs.add(num);
				result.add(num);
			}
		}
		return result;
	}
}
