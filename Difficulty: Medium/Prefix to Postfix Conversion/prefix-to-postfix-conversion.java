class Solution {
	static String preToPost(String s) {
		// code here
		Stack<String> st = new Stack<>();
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				String x = st.pop();
				String y = st.pop();
				st.push(x + y + ch);
			}
			else if (ch != ' ')
				st.push(ch + "");
		}
		return st.pop();
	}
}
