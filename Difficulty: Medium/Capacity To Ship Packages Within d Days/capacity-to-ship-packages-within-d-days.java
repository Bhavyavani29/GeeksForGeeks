class Solution {
    public int leastWeightCapacity(ArrayList<Integer> arr, int d) {
        // code here
        int low = 1, high = 0, result = 0;
        for(int num : arr){
            high += num;
            low = Math.max(num, low);
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(shipCapacity(arr, d, mid)){
                result = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return result;
    }
    public static boolean shipCapacity(ArrayList<Integer> arr, int d, int currMidValue){
        int maxDays = 1, currSum = 0;
        for(int num : arr){
            if(currSum + num > currMidValue){
                maxDays++;
                currSum = 0;
            }
            currSum += num;
        }
        return maxDays <= d;
    }
}