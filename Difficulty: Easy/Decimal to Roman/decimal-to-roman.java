class Solution {
	public String convertToRoman(int n) {
		// code here
		StringBuilder res = new StringBuilder();
		String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		int i = 0;
		while (n > 0) {
			if (n >= value[i]) {
				res.append(symbol[i]);
				n -= value[i];
			}
			else
				i++;
		}
		return res.toString();
	}
}
