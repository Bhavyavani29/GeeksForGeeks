class Solution {
    char firstRep(String S) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (hm.get(ch) > 1) {
                return ch;
            }
        }
        return '#';
    }
}
