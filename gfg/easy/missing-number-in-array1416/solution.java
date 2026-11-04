class Solution {
    int missingNum(int arr[]) {
        int xorSum = 0;

            // xor with arr element
            for (int i : arr) {
                xorSum = xorSum ^ i;
            }

            // xor with range
            int n = arr.length;
            for (int i = 1; i <= n +1; i++) {
                xorSum = xorSum ^ i;
            }
            return xorSum;
    }
}