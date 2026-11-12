class CheckBit {
	static boolean checkKthBit(int n, int k) {
		// code here
		int mass = (n>> k);
		return (mass % 2 == 1);
	}
}
