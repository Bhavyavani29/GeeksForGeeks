class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int left = 0;
        int right = arr.length - 1;
        int maxWater = 0;
        while(left <= right){
            int width = right - left;
            int currWater = Math.min(arr[left], arr[right]) * width;
            maxWater = Math.max(maxWater, currWater);
            if(arr[left] < arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
}