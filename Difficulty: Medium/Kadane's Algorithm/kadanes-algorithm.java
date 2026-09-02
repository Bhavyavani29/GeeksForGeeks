class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int CurrMax = arr[0];
        int Max = arr[0];
        for(int i = 1;i < arr.length; i++){
            CurrMax = Math.max(arr[i], CurrMax + arr[i]);
            Max = Math.max(Max, CurrMax);
        }
        return Max;
    }
}
