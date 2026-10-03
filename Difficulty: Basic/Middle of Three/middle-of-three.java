class Solution {
	int middle(int a, int b, int c) {
		// code here
		if ((a > b && a < c) || (a < b && a > c))
			return a;
		else if ((b > a && b < c) || (b > c && b < a))
			return b;
		else
			return c;
	}
}
