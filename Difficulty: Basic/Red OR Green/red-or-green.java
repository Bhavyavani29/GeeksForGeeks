class Solution {
    public int redOrGreen(String s) {
        // code here
        int Rcount = 0, Gcount = 0;
        for(char ch : s.toCharArray()){
            if(ch  == 'R'){
                Rcount++;
            }
            else{
                Gcount++;
            }
        }
        return Math.min(Rcount, Gcount);
    }
}