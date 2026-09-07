class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
		TreeMap<Integer,Integer> tm = new TreeMap<>();
		for(int i = 0;i < k;i++){
			tm.put(arr[i],tm.getOrDefault(arr[i],0)+1);
		}
		res.add(tm.lastKey());
		for(int i = 1;i <= n-k;i++){
			tm.put(arr[i+k-1],tm.getOrDefault(arr[i+k-1],0)+1);
			int count = tm.get(arr[i - 1]) - 1;
            if(count == 0) 
                tm.remove(arr[i - 1]);
            else 
                tm.put(arr[i - 1], count);
			res.add(tm.lastKey());
		}
		return res;
    }
}