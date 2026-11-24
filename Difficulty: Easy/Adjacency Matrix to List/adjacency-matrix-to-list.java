class Solution {
  public ArrayList<ArrayList<Integer>> matToAdj(int[][] mat) {
    // code here
    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    for (int i = 0; i < mat.length; i++) {
      ArrayList<Integer> a = new ArrayList<>();
      for (int j = 0; j < mat.length; j++) {
        if (mat[i][j] == 1)
          a.add(j);
      }
      arr.add(a);
    }
    return arr;
  }
}