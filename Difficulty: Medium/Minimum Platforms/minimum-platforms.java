class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        int n = arr.length;
        int v[][] = new int[n][2];
		for(int i = 0;i < n;i++){
			v[i][0] = arr[i];
			v[i][1] = dep[i];
		}
		Arrays.sort(v,(a,b) ->a[0] - b[0]);
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int res = 0;
		for(int i = 0;i < n;i++){
			while(!pq.isEmpty() && pq.peek() < v[i][0]){
				pq.poll();
			} 
			pq.add(v[i][1]);
			res = Math.max(res,pq.size());
		}
		return res;
    }
}
