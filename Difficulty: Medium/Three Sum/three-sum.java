class SortPairs implements Comparator<List<Integer>>{
    public int compare(List<Integer> a, List<Integer> b){
        for(int i = 0;i < a.size();i++){
            if(a.get(i) != b.get(i)){
                return a.get(i) - b.get(i);
            }
        }
        return 0;
    }
}
class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i = 0;i < n;i++){
            if(i > 0 && arr[i] == arr[i-1])
                continue;
            int l = i + 1, r = n - 1;
            while(l < r){
                int x = arr[i] + arr[l] + arr[r];
                if(x == 0){
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(arr[i]);
                    al.add(arr[l]);
                    al.add(arr[r]);
                    res.add(al);
                    l++;
                    r--;
                    while(l < r && arr[l] == arr[l-1])
                    l++;
                    while(l < r && arr[r] == arr[r+1])
                    r--;
                }
                else if(x < 0)
                    l++;
                else
                    r--;
            }
        }
        return res;
    }
}
