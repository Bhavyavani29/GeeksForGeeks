class Solution {
	public ArrayList<Integer> fibonacciNumbers(int n) {
		// code here
		int a = 0, b = 1, c = 0;
		ArrayList<Integer> al = new ArrayList<>();
		if (n >= 1)
			al.add(0);
		if (n >= 2)
			al.add(1);
		for (int i = 2; i < n; i++) {
			c = a + b;
			al.add(c);
			a = b;
			b = c;
		}
		return al;
	}
}
