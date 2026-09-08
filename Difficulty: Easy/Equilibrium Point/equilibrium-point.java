class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int total = 0, rSum = 0, lSum = 0 ;
        for(int i = 0 ; i < arr.length; i++){
            total = total + arr[i];
        }
        for(int i = 0 ; i < arr.length; i++){
            rSum = total - lSum - arr[i];
            if(lSum == rSum) return i;
            lSum = lSum + arr[i];
        }
        return -1;
    }
}
