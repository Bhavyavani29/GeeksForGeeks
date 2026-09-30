class Solution {
    public void reverseArray(int[] arr) {
        // code here
        Stack <Integer> st = new Stack<>();
        for(int num : arr){
            st.push(num);
        }
        int index = 0;
        while(!st.isEmpty()){
            arr[index] = st.pop();
            index++;
        }
    }
}
