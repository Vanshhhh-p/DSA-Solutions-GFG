class Solution {
    int maxSum(int arr[]) {
        int n = arr.length;

        int sum = 0;
        int currSum = 0;

        // Calculate total sum and initial weighted sum
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            currSum += i * arr[i];
        }

        int maxSum = currSum;

        // Calculate weighted sum for each rotation
        for (int i = 1; i < n; i++) {
            currSum = currSum + sum - n * arr[n - i];

            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
