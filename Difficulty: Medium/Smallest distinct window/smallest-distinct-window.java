// User function Template for Java

class Solution {
    public int findSubString(String str) {
        // code here
        Map<Character,Integer> hm = new HashMap<>();
        int small = Integer.MAX_VALUE;
        int i = 0,j = 0, unique = 0;
        while(j < str.length()){
            char c = str.charAt(j);
            hm.put(c,hm.getOrDefault(c,0)+1);
            while(i < str.length() && hm.get(str.charAt(i)) > 1){
                hm.put(str.charAt(i),hm.get(str.charAt(i)) - 1);
                i++;
            }
            if(hm.size() > unique){
                unique = hm.size();
                small = j-i+1;
            }else{
                small = Math.min(small,j-i+1);
            }
            j++;
        }
        return small;
    }
}