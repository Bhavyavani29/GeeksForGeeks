class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
         int low = 1, high = 0, result = 0;
        for (int num : arr) {
            high = Math.max(num, high);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canEat(arr, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
    public static boolean canEat(int[] arr, int k, int currMidValue) {
        long totalHours = 0;
        for(int num : arr){
            int hoursForPile = num / currMidValue;
            if (num % currMidValue != 0) {
                hoursForPile++;
            }
            totalHours += hoursForPile;
        }
        return totalHours <= k;
    }
}
