class Solution {
	public int findDiff(int[] arr) {
		// code here
		HashMap<Integer, Integer> h = new HashMap<>();
		for (int num : arr) {
			h.put(num, h.getOrDefault(num, 0) + 1);
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int freq : h.values()){
		    if(freq > max)
		        max = freq;
		    if(freq < min)
		        min = freq;
		}
		return max - min;
	}
}
