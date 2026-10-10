class Solution {
    public ArrayList<Integer> isCircularPrime(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        int maxRotationValue = getMaxRotationValue(n);
        boolean[] isPrime = sieve(maxRotationValue);
        for (int i = 2; i < n; i++) {
            if (isPrime[i] && isCircular(i, isPrime)) {
                result.add(i);
            }
        }
        return result;
    }
    private boolean[] sieve(int limit) {
        boolean[] prime = new boolean[limit + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i * i <= limit; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    prime[j] = false;
                }
            }
        }
        return prime;
    }
    private boolean isCircular(int num, boolean[] isPrime) {
        String s = String.valueOf(num);
        int len = s.length();
        for (int i = 0; i < len; i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            int rotatedNum = Integer.parseInt(rotated);
            if (rotatedNum >= isPrime.length || !isPrime[rotatedNum]) {
                return false;
            }
        }
        return true;
    }
    private int getMaxRotationValue(int n) {
        int maxDigits = String.valueOf(n - 1).length();
        // Largest number with maxDigits (e.g., 999 for 3 digits)
        return (int) Math.pow(10, maxDigits) - 1;
    }
}
