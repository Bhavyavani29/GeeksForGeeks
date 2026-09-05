class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int n = start.length;
        PriorityQueue <int[]> pq = new PriorityQueue<>((x,y) -> x[1] - y[1]);
		for(int i = 0;i < n;i++){
			pq.add(new int[] {start[i],finish[i]});
		}
		int ans = 0,ftime = -1;
		while(!pq.isEmpty()){
			int z[] = pq.poll();
			if(z[0] > ftime){
				ans++;
				ftime = z[1];
			}
		}
		return ans;
    }
}
