class Solution {
    public boolean kPangram(String s, int k) {
        // code here
        boolean arr[] = new boolean[26];
        int totalLetters = 0, uniqueLetters = 0;;
        for(char ch : s.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                totalLetters++;
                if(!arr[ch - 'a']){
                    arr[ch - 'a'] = true;
                    uniqueLetters++;
                }
            }
        }
        if(totalLetters < 26){
            return false;
        }
        if(26 - uniqueLetters <= k){
            return true;
        } 
        return false;
        
        
        /*HashSet<Character> hs = new HashSet<>();
        if(s.length() < 26){
            return false;
        }
        for(char ch : s.toCharArray()){
            hs.add(ch);
        }
        if(hs.size() + k == 26){
            return true;
        }
        return false;*/
    }
}