class Solution {
    public int longestSubarray(int arr[]) {
        // code here
        int currCount = 0, maxCount = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] >= 0){
                currCount++;
            }
            else{
                maxCount = Math.max(currCount, maxCount);
                currCount = 0;
            }
        }
        return Math.max(currCount, maxCount);
    }
}