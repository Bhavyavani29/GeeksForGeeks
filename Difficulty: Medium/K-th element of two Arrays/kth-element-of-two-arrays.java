class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        /* int[] sorted = new int[a.length + b.length];
        for(int i = 0;i < a.length;i++){
            for(int j = 0; j < b.length; j++){
                for(int k = 0; k < (a.length + b.length); k++ )
                    if(a[i] < b[j])
                        sorted
            }
        } */
        
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < a.length && j < b.length){
            if (a[i] <= b[j]) {
                count++;
                if(count == k)
                    return a[i];
                i++;    
            }
            else{
                count++;
                if(count == k)
                    return b[j];
                j++;    
            }
        }
        while (i < a.length) {
            count++;
            if (count == k) 
                return a[i];
            i++;
        }
        while (j < b.length) {
            count++;
            if (count == k)
                return b[j];
            j++;
        }
        return -1;
    }
}














