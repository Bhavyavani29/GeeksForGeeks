class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        TreeSet <Integer> ts = new TreeSet<>();
        for(int i = 0;i < a.length;i++){
            ts.add(a[i]);
        }
        for(int i = 0;i < b.length;i++){
            ts.add(b[i]);
        }
        return new ArrayList(ts);
    }
}
