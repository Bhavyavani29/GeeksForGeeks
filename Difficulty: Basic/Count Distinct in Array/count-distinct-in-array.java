class Solution {
    public int countDistinct(int arr[]) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0;i < arr.length;i++){
            hs.add(arr[i]);
        }
        return hs.size();
    }
}