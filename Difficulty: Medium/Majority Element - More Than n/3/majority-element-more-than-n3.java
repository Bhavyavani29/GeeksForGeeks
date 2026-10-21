class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int n = arr.length;
        HashMap<Integer,Integer> h =new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int num : arr){
            h.put(num, h.getOrDefault(num,0) + 1);
        }
        Set<Integer> s1 = h.keySet();
        for(int x : s1){
            if(h.get(x) > n / 3){
                al.add(x);
            }
        }
        Collections.sort(al);
        return al;
    }
}