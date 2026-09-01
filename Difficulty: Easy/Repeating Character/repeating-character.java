class Solution {
    static int repeatedCharacter(String S) {
        // code here
        HashMap<Character, Integer> hm = new HashMap<>();
        int n = S.length();
        for(int i = 0;i < n;i++){
            char ch = S.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0;i < n;i++){
            char ch = S.charAt(i);
            if(hm.get(ch) > 1)
                return i;
        }
        return -1;
    }
}