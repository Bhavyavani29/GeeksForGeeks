class Solution {

    int[][] dp;

    public ArrayList<ArrayList<Integer>> shortestDist(int[][] mat) {

        int n = mat.length;

        int[][] path = new int[n][n];
        dp = new int[n][n];

        if (!solve(mat, path, 0, 0, n)) {

            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            ArrayList<Integer> row = new ArrayList<>();
            row.add(-1);
            ans.add(row);

            return ans;
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(path[i][j]);
            }

            ans.add(row);
        }

        return ans;
    }

    boolean solve(int[][] mat, int[][] path, int i, int j, int n) {

        if (i >= n || j >= n)
            return false;

        if (i == n - 1 && j == n - 1) {
            path[i][j] = 1;
            return true;
        }

        if (mat[i][j] == 0)
            return false;

        if (dp[i][j] == -1)
            return false;

        path[i][j] = 1;

        int jump = mat[i][j];

        for (int step = 1; step <= jump; step++) {

            if (solve(mat, path, i, j + step, n))
                return true;

            if (solve(mat, path, i + step, j, n))
                return true;
        }

        path[i][j] = 0;

        dp[i][j] = -1;

        return false;
    }
}