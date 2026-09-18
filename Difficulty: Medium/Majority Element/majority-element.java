class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n = arr.length;
        HashMap<Integer,Integer> h =new HashMap<>();
        for(int num : arr){
            h.put(num, h.getOrDefault(num,0) + 1);
            if(h.get(num) > n / 2){
                return num;
            }
        }
        return -1;
    }
}