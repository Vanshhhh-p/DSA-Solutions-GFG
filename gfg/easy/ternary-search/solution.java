class Solution {
    public int findMinIndex(int[] arr) {
        int n = arr.length;
        int count = 1;

        for (int i = 0; i < n-1; i++) {
            if (arr[i] < arr[i+1]) {
                return i;
            }
            count++;
        }
        
        if (count == n) {
            return n-1;
        }
        else return -1;
    }
}