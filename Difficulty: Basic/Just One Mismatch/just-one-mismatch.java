class Solution {
	public boolean isStringExist(String s, String[] arr) {
		// code here
		for (String str : arr) {
			int count = 0;
			if (str.length() == s.length()) {
				for (int i = 0; i < s.length(); i++) {
					if (str.charAt(i) != s.charAt(i)) {
						count++;
					}
				}
				if (count == 1) {
					return true;
				}
			}
		}
		return false;
	}
}
