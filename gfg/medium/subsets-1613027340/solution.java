
class Solution {

    static void solve(int[] nums, int index,
                      ArrayList<Integer> output,
                      ArrayList<ArrayList<Integer>> ans) {

        // Base case
        if (index >= nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }

        int currentValue = nums[index];

        // Include
        output.add(currentValue);
        solve(nums, index + 1, output, ans);

        // Backtracking: remove the last added element
        output.remove(output.size() - 1);

        // Exclude
        solve(nums, index + 1, output, ans);
    }

    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();

        int index = 0;
        solve(arr, index, output, ans);

        return ans;
    }
}
