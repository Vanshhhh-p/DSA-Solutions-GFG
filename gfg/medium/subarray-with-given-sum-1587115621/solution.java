
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();

        int left = 0;
        int sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {
                ans.add(left + 1);   // 1-based starting index
                ans.add(right + 1);  // 1-based ending index
                return ans;
            }
        }

        ans.add(-1);
        return ans;
    }
}
