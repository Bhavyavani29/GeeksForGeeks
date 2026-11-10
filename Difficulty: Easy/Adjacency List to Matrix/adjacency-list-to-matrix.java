class Solution {
	public int[][] adjToMat(ArrayList<ArrayList<Integer>> adj) {
		// code here
		int v = adj.size();
		int mat[][] = new int[v][v];
		for (int i = 0; i<v; i++) {
			for (int j:adj.get(i)) {
				mat[i][j] = 1;
			}
		}
		return mat;
	}
}
