class Solution {
    public void printTillN(int n) {
        // code here
        if(n == 0){
            return;
        }
        int i = 1;
        while(i <= n){
            System.out.print(i + " ");
            i++;
        }
    }
}