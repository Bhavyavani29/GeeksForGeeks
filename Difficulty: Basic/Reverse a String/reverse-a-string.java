class Solution {
    public static String reverseString(String s) {
        // code here
        //return new StringBuilder(s).reverse().toString();
        char ch [] = s.toCharArray();
        int n = ch.length;
        int i = 0, j = n - 1;
        while(i < j){
            char x = ch[i];
            ch[i] = ch[j];
            ch[j] = x;
            i++;
            j--;
        }
        return new String(ch);
    }
}