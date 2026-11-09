class Solution {
    public static int largest(int[] arr) {
        int maxElement = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > maxElement) {
                maxElement = i;
            }
        }
        return maxElement;
    }
}
