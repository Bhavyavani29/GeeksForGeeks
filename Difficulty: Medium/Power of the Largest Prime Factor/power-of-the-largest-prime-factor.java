// User function Template for Java

class Solution {
    static boolean largePrime(long n) {
        // code here
        return (primeFactPowers(n))?true:false;
    }
    public static boolean primeFactPowers(long n){
        int max=0;
        long lp=-1;
        if(n<=1) return false;
        if(n%2==0){
           int c=0;
	       while(n%2==0){
	         c++;
	         n=n/2;
    	   }
    	   if(c>0){
    	     lp=2;
    	     max=c;
    	   }
        }
	    for(long i=3;i*i<=n;i+=2){
	        int c=0;
	        while(n%i==0){
	            n=n/i;
		        c++;
	         }
	         if(c>0){
                 lp=i;
    	         max=c;
	         }
	    }
	    if(n>2) {
    	    lp=n;
    	    max=1;
	    }
    	return max>1;
    }
}