class Solution {
    public static String concatenatedString(String s1, String s2) {
        // code here
        StringBuilder sb = new StringBuilder();
        HashSet<Character> hs1 = new HashSet<>();
        char[] ch1 = s2.toCharArray();
        char[] ch2 = s1.toCharArray();
        for(char c : ch1){
            hs1.add(c);
        }
        for(int i = 0;i < s1.length();i++){
            if(!hs1.contains(s1.charAt(i))){
                sb.append(s1.charAt(i));
            }
        }
        HashSet<Character> hs2 = new HashSet<>();
        for(char c : ch2){
            hs2.add(c);
        }
        for(int i = 0;i < s2.length();i++){
            if(!hs2.contains(s2.charAt(i))){
                sb.append(s2.charAt(i));
            }
        }
        if(sb.length() > 0) return String.valueOf(sb);
        else return "-1";
    }
}
