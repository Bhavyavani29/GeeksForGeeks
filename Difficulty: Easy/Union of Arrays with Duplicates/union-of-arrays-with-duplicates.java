class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < a.length;i++){
            hs.add(a[i]);
        }
        for(int j = 0; j < b.length;j++){
            hs.add(b[j]);
        }
        return new ArrayList(hs);
    }
}