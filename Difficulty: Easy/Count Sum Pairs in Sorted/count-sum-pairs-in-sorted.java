class Solution {
    int countPairs(int arr[], int target) {
        //  Code Here
       HashMap<Integer, Integer> hm = new HashMap<>();
       int count = 0;
       for(int num : arr){
           
           int remain = target - num;
           if(hm.containsKey(remain)){
               count += hm.get(remain);
           }
           hm.put(num, hm.getOrDefault(num, 0) + 1);
       }
       return count;
       
        /*int n = arr.length;
        int i = 0, j = n - 1;
        int count = 0;
        while(i < n && j > 0){
            if(arr[i] + arr[j] == target){
                count++;
                i++;
            }
            i = 0;
            j++;
        }
        return count; */
    }
}
