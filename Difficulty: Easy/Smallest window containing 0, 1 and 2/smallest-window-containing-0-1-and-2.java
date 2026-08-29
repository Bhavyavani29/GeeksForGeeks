// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
        // Code here
        int n = S.length();
        int[] count = new int[3];
        int dist = 0;
        int left = 0, minLen = Integer.MAX_VALUE;
        for(int right = 0;right < n;right++){
            int idx = S.charAt(right)-'0';
            if(count[idx] == 0) dist++;
            count[idx]++;
            while(dist == 3){
                minLen = Math.min(minLen,right-left+1);
                int l = S.charAt(left)-'0';
                count[l]--;
                if(count[l] == 0) dist--;
                left++;
            }
        }
        if(minLen == Integer.MAX_VALUE) return -1;
        else return minLen;
    }
};
