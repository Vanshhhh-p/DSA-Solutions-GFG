
class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        long sum = 0, maxSum = -1;
        int start = 0, bestStart = -1, bestEnd = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sum = 0;
                start = i + 1;
            } else {
                sum += arr[i];

                if (sum > maxSum ||
                    (sum == maxSum && i - start > bestEnd - bestStart)) {
                    maxSum = sum;
                    bestStart = start;
                    bestEnd = i;
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        if (bestStart == -1) {
            ans.add(-1);
            return ans;
        }

        for (int i = bestStart; i <= bestEnd; i++) {
            ans.add(arr[i]);
        }

        return ans;
    }
}
