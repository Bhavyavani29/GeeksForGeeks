class Solution {
    public boolean checkEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        //   code here
        return adj.get(u).contains(v);
    }
}