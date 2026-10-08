class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
        int n = arr.length;
        ArrayList<Integer> police = new ArrayList<>();
        ArrayList<Integer> thief = new ArrayList<>();
		for(int i = 0;i < n;i++){
			if(arr[i] == 'P')
                police.add(i);
            else if(arr[i] == 'T')
                thief.add(i);
		}
		int i = 0,j = 0,res = 0;
		while(i < police.size() && j < thief.size()){
            if(Math.abs(police.get(i) - thief.get(j)) <= k){
                res++;
                i++;
                j++;
            }
            else if(police.get(i) < thief.get(j))
                i++;
            else
                j++;
        }
        return res;
    }
}