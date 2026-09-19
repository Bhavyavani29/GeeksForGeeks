class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int currSum = 0;
        for(int i = 0;i < k;i++){
            currSum += arr[i];
        }
        int maxSum = currSum;
        for(int i = k; i< arr.length;i++){
            currSum += arr[i] - arr[i - k];
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}