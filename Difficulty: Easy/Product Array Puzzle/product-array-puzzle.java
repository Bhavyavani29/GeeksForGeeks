// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int count = 0, total = 1;
        int[] res = new int[arr.length];
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == 0){
                count ++;
            }
            else{
                total = total * arr[i];
            }
        }
        for(int i = 0;i < arr.length;i++){
            if(count > 1) 
                res[i] = 0;
            else if(count == 1) 
                res[i] = (arr[i] == 0) ? total : 0;
            else
                res[i] = total / arr[i];
        }
        return res;
    }
}
