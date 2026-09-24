class Solution {
	public String reverseSort(String s) {
		// code here
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		s = String.valueOf(ch);
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
}
