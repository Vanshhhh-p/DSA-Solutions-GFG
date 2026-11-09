class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int num : arr) {
            if (!set.add(num)) {
                ans.add(num);
            }
        }

        return ans;
    }
}