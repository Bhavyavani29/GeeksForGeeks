class Solution {
    public int countVowels(String s) {
        // code here
        HashSet<Character> hs = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                hs.add(ch);
            }
        }
        return hs.size();
    }
}