class Solution {
	public double medianOf2(int a[], int b[]) {
		// Code Here
		int m = a.length;
		int n = b.length;
		int sorted[] = new int[m + n];
		int i = 0, j = 0, k = 0;
		while (i < m && j < n) {
			if (a[i] <= b[j]) {
				sorted[k] = a[i];
				k++;
				i++;
			}
			else{
			    sorted[k] = b[j];
			    k++;
			    j++;
			}
		}
		while(i < m){
		    sorted[k++] = a[i++];
		}
		while(j < n){
		    sorted[k++] = b[j++];
		}
		int mid = sorted.length / 2;
		if(sorted.length % 2 == 0)
		    return(sorted[mid - 1] + sorted[mid]) / 2.0;
		 else
		    return sorted[mid];
	}
}
