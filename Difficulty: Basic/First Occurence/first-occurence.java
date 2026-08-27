class Solution {
    int firstOccurence(String txt, String pat) {
        // code here
        if(txt.contains(pat)){
            int b = txt.indexOf(pat);
            return b;
        }
        else
            return -1;
    }
}