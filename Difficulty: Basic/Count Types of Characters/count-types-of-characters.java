class Sol {
	int[] count(String s) {
		// your code here
		int ucnt = 0, lcnt = 0, scnt = 0, ncnt = 0;
		for (char ch : s.toCharArray()) {
			if (Character.isUpperCase(ch))
				ucnt++;
			else if (Character.isLowerCase(ch))
				lcnt++;
			else if (Character.isDigit(ch))
				ncnt++;
			else
				scnt++;
		}
		return new int[] {ucnt, lcnt, ncnt, scnt};
	}
}
