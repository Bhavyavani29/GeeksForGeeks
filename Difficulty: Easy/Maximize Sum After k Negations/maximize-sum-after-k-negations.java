class Solution {
    public int maximizeSum(int[] arr, int k) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 0;i < n && k > 0;i++){
            if(arr[i] < 0){
            arr[i] = -arr[i];
            k--;
            }
        }
        if(k % 2 != 0){
            Arrays.sort(arr);
            arr[0] = -arr[0];
        }
        int sum = 0;
        for(int i = 0;i < n;i++){
            sum += arr[i];
        }
        return sum;
    }
}