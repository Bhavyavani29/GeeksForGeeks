class Solution {
    public static boolean isPalindrome(int[] arr) {
        // code here
        int n = arr.length;
        for(int i = 0;i <= n/2;i++){
            if(arr[i] != arr[n-1-i])
                return false;
        }
        return true;
    }
}
