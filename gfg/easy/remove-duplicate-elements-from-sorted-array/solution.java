class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        int i = 0;
        int j = 1;

        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        if (n == 0) return ans;

        ans.add(arr[0]);

        while (j < n) {
            if (arr[i] == arr[j]) {
                j++;
            } 
            else {
                i++;
                arr[i] = arr[j];
                ans.add(arr[i]);
                j++;
            }
        }

        return ans;
    }
}