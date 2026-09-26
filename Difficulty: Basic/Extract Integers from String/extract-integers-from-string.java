class Solution {
    public List<String> extractInt(String s) {
        List<String> al = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                str.append(ch);
            } else {
                if (str.length() > 0) {
                    al.add(str.toString());
                    str.setLength(0);
                }
            }
        }
        if (str.length() > 0) {
            al.add(str.toString());
        }
        return al;
    }
}
