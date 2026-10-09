class Solution {
    public int findMinIndex(int[] arr) {
        // code here
        int n = arr.length;
        int l = 0,h = n - 1;
		while(l < h){
			int m1 = l + (h-l) / 3;
			int m2 = h - (h-l) / 3;
			if(arr[m2] > arr[m1]){
			    h = m2 - 1;
			} 
			else{
			    l = m1 + 1;
			}
		}
		return l;
    }
}
