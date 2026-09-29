class Solution {
	public String decimalToBase(int b, int n) {
		// code here
		if (n == 0)
			return "0";
		StringBuilder res = new StringBuilder();
		while (n > 0) {
			int rem = n % b;
			char digit = (char)(rem < 10 ? '0' + rem : 'A' + (rem - 10));
			res.append(digit);
			n /= b;
		}
		return res.reverse().toString();
	}
}
