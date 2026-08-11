class Solution {
	public int sumOfDistinct(int[] arr) {
		// code here
		int sum = 0;
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
			
		}
		for (int num : hs) {
			sum += num;
		}
		return sum;
	}
}
