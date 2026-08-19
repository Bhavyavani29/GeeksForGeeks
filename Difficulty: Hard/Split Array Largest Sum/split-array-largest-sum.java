class Solution {
    public int splitArray(int[] arr, int k) {
        int low = 0;
        int high = 0;
        for (int num : arr) {
            low = Math.max(low, num); 
            high += num;
        }
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isFeasible(arr, k, mid)) {
                ans = mid; 
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    private boolean isFeasible(int[] arr, int k, int maxTargetSum) {
        int subarrayCount = 1;
        int currentSum = 0;
        for (int num : arr) {
            if (currentSum + num <= maxTargetSum) {
                currentSum += num;
            } else {
                subarrayCount++;
                currentSum = num;
                if (subarrayCount > k) {
                    return false;
                }
            }
        }
        return true;
    }
}
