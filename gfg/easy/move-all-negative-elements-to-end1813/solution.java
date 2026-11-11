class Solution {
    public void segregateElements(int arr[]) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

        // Store positive and zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[index++] = arr[i];
            }
        }

        // Store negative elements
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[index++] = arr[i];
            }
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
