class Solution {
    public int countSubstring(String s) {
        // code here
        HashMap<Character, Integer> hm = new HashMap<>();
        int result = s.length();
        for(char ch : s.toCharArray()){
            result += hm.getOrDefault(ch, 0);
            hm.put(ch, hm.getOrDefault(ch, 0)  +1);
        }
        return result;
    }
}