class Solution {
  public int minProductSum(int[] a, int[] b) {
    // code here
    Arrays.sort(a);
    Arrays.sort(b);
    int j = b.length - 1;
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i] * b[j];
      j--;
    }
    return sum;
  }
}