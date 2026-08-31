class Solution {
    public static int kThSmallestFactor(int n, int k) {
        //code here.
      List<Integer> fact=new ArrayList<>();
      for(int i=1;i*i<=n;i++){
          if(n%i==0){
              fact.add(i);
              if(i!=n/i){
                  fact.add(n/i);
              }
          }
      }
      Collections.sort(fact);
      return (k<=fact.size())?fact.get(k-1):-1;
    }
}
