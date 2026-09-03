class Solution {
    int missingNum(int arr[]) {
        // code here
        long n = arr.length + 1;
        long total = n * (n + 1) / 2;
        long sum = 0;
        for(int i = 0;i < arr.length;i++){
            sum = sum + arr[i];
        }
        return (int)(total - sum);
    } 
      /*  int n = arr.length + 1;
        int a[] = new int[n];
        int ans = 0;
        for(int i = 0;i < n;i++){
            a[i] = i + 1;
        }
        
        for(int i =0;i <n - 1;i++){
            ans = ans ^ arr[i] ^ a[i];
        }
        ans = ans ^ a[n - 1];
        return ans;
    } */
}

