class Solution {
    public int count(String s) {
        // code here
        HashMap<Character,Integer> hm = new HashMap<>();
        for(Character ch : s.toCharArray() ){
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        int count =0;
        for(int ch : hm.values()){
            if(ch % 2 ==0){
                count++;
            }
        }
        return count;
    }
}