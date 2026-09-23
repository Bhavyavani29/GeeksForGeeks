class Solution {
    public String longest(String[] arr) {
        // code here
        int max = 0 , length = 0, idx = 0;
        String name = "";
        for(int i = 0;i < arr.length;i++){
            name = arr[i];
            length = name.length();
            if(max < length){
                max = length;
                idx = i;
            }
        }
        return arr[idx];
    }
}