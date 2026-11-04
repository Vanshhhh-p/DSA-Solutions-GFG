class Solution {
    public int findUnique(int[] arr) {
        int xorSum = 0;
        for (int i : arr) {
            xorSum ^= i;
        }
        return xorSum;
    }
}