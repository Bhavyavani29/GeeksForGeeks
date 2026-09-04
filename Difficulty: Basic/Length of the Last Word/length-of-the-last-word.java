class Solution {
    public int lastWordLen(String s) {
        // code here
        int len = s.length() - 1;
        while(len >= 0 && s.charAt(len) == ' '){
            len--;
        }
        int length = 0;
        while(len >= 0 && s.charAt(len) != ' '){
            length++;
            len--; 
        }
        return length;
    }
}