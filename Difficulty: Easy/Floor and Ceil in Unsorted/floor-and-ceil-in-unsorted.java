class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        int floor = -1, ceil = -1;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num <= x) {
                if (floor == -1 || num > floor) {
                    floor = num;
                }
            }
            if (num >= x) {
                if (ceil == -1 || num < ceil) {
                    ceil = num;
                }
            }
        }
        return new int[]{floor, ceil};
    }
}
