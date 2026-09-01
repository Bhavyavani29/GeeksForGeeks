// User function Template for Java
class Solution {
    String firstRepChar(String s) {
        // code here
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0;i < s.length();i++){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
            }
            else{
                return s.charAt(i) + "";
            }
        }
        return "-1";
    }
}