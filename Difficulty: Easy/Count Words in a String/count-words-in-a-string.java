class Solution {
    public int countWords(String s) {
        // code here
        if(s == null || s.length() <= 0)
            return 0;
        boolean word = false;
        int wordCount = 0;
        for(int  i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' ' || ch == '\t' || ch == '\n'){
                word = false;
            }
            else if(!word){
                wordCount++;
                word = true;
            }
        }
        return wordCount;
    }
}