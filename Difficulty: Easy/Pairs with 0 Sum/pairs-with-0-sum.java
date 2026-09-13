// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
		int i = 0, j = n - 1;
		while(i < j){
			int x = arr[i] + arr[j];
			if(x == 0){
				ArrayList<Integer> al = new ArrayList<>();
				al.add(arr[i]);
				al.add(arr[j]);
				res.add(al);
				i++;
				j--;
			}
			else if(x < 0)
				i++;
			else
				j--;
			while(i < j && i > 0 && arr[i] == arr[i - 1]){
			    i++;
			}
			while(i < j && j < n - 1 && arr[j] == arr[j + 1]){
			    j--;
			}
		}
		return res;
    }
}