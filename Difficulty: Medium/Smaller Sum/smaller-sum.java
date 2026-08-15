class Solution {
	public ArrayList<Integer> smallerSum(int[] arr) {
		// code here
		int [] sortedArray = arr.clone();
		Arrays.sort(sortedArray);
		int prefixsum [] = new int[arr.length];
		int current = 0;
		for (int i = 0; i < sortedArray.length; i++) {
			prefixsum[i] = current;
			current += sortedArray[i];
		}
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < sortedArray.length; i++) {
			if (!hm.containsKey(sortedArray[i])) {
				hm.put(sortedArray[i], prefixsum[i]);
			}
		}
		int ans[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			ans[i] = hm.get(arr[i]);
		}
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < ans.length; i++) {
			result.add(ans[i]);
		}
		return result;
	}
}
