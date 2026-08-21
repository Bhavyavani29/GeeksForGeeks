class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        int n = arr.length;
        // ArrayList <Integer> result = new ArrayList<>(Collections.nCopies(n, -1));
        ArrayList <Integer> result = new ArrayList<>();
        Stack <Integer> st = new Stack<>();
        for(int i = 0;i < n;i++){
            result.add(-1);
        }
        for(int i = n - 1;i >= 0;i--){
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }
            if(!st.isEmpty() && st.peek() < arr[i]){
                result.set(i, st.peek());
            }
            st.push(arr[i]);
        }
        return result;
    }
}