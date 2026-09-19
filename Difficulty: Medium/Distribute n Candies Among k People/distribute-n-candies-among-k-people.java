class Solution {
    public ArrayList<Integer> distributeCandies(int n, int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<>(k);
        for(int i = 0;i < k;i++){
            result.add(0);
        }
        int maxCandies = 1;
        int i =  0;
        while(n > 0){
            int distribute = Math.min(n, maxCandies);
            result.set(i, result.get(i) + distribute);
            n -= distribute;
            maxCandies++;
            i = (i + 1) % k;
        }
        return result;
    }
}