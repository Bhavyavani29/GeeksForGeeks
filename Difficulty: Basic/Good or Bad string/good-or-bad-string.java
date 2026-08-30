// User function Template for Java

class Solution {
    static int isGoodorBad(String S) {
        // code here
        int Vcount = 0, Ccount = 0;
        for(int i = 0;i < S.length(); i++){
            char ch = S.charAt(i);
            if(ch == '?') {
                Vcount++;
                Ccount++;
            }
            else if(isVowel(ch)){
                Vcount++;
                Ccount = 0;
            }
            else{
                Ccount++;
                Vcount = 0;
            }
            if(Vcount > 5 || Ccount > 3)
                return 0;
        }
        return 1;
    }
    static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
};