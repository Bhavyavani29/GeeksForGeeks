class Solution {
    int minDist(int arr[], int x, int y) {
        int idxX = -1;
        int idxY = -1;
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                idxX = i;
                if (idxY != -1) {
                    minDistance = Math.min(minDistance, Math.abs(idxX - idxY));
                }
            }
            if (arr[i] == y) {
                idxY = i;
                if (idxX != -1) {
                    minDistance = Math.min(minDistance, Math.abs(idxX - idxY));
                }
            }
        }
        return (minDistance == Integer.MAX_VALUE) ? -1 : minDistance;
    }
}
