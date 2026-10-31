class Solution {
    int lastIndex(String s, char c) {
        // code here
        int n = s.length();
        for(int i = n - 1; i >= 0;i--){
            if(s.charAt(i) == c){
                return i;
            }
        }
        return -1;
    }
}
