class Solution {
    int maxSweetness(int[] sweetness, int k) {
        // code here
        int low = 1, high = 0, result = 0;
        for(int num : sweetness){
            high += num;
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(canDivide(sweetness, k + 1, mid)){
                result = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return result;
    }
    public static boolean canDivide(int []sweetness, int requiredPieces, int currValue){
        int currSum = 0;
        int maxPieces = 0;
        for(int num : sweetness){
            currSum += num;
            if(currSum >= currValue){
                maxPieces++;
                currSum = 0;
            }
        }
        return maxPieces >= requiredPieces;
    }
}