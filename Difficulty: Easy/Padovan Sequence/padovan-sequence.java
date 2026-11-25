class Solution {
  public int padovanSequence(int n) {
    // code here.
    int z = 1, o = 1, t = 1;
    int MOD = 1000000007;
    if (n < 3)
      return 1;
    for (int i = 3; i <= n; i++) {
      int f = (z + o) % MOD;
      z = o;
      o = t;
      t = f;
    }
    return t % MOD;
  }
}
