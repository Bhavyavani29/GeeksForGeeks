class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int l = 0;
        for(int r = 0; r < arr.length;r++){
            if(arr[r] != 0){
                int temp = arr[r];
                arr[r] = arr[l];
                arr[l] = temp;
                l++;
                
            }
        }
    }
}