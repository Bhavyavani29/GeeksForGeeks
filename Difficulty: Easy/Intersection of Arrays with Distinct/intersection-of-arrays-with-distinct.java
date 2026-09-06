class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0;i < a.length;i++){
            hs.add(a[i]);
        }
        HashSet<Integer> intersection = new HashSet<>();
        for(int i = 0; i < b.length;i++){
            if(hs.contains(b[i])){
                intersection.add(b[i]);
            }
        }
        return intersection.size();
    }
}