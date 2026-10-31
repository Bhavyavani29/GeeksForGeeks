class Solution {
    public int longestSubstring(String s) {
        // code here
        int currCount = 0, result = 0;
        for(char ch : s.toCharArray()){
            if(ch == '1'){
                currCount++;
                result = Math.max(result, currCount);
            }
            else{
                currCount = 0;
            }
        }
        return result;
    }
}