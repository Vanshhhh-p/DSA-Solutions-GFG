class Solution {
    public ArrayList<Integer> findIndex(int[] arr, int key) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (ans.isEmpty()) {
                    ans.add(i); // First occurrence (Index 0)
                    ans.add(i); // Assume it's also the last occurrence for now (Index 1)
                } else {
                    ans.set(1, i); // Update the last occurrence at Index 1
                }
            }
        }

        // If the loop finished and nothing was found, fill it with -1
        if (ans.isEmpty()) {
            ans.add(-1);
            ans.add(-1);
        }

        return ans;
    }
}
