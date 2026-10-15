class Solution {
	String transformString(String s) {
		// code here
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch)) {
				sb.append((char)('A' + ('Z' - ch)));
			} 
			else {
				sb.append((char)('a' + ('z' - ch)));
			}
		}
		return sb.toString();
	}
}
