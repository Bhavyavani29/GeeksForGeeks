class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : arr){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for(int num : arr){
            int freq = hm.get(num);
            if(freq % 2 != 0)
                return num;
        }
        return -1;
    }
}