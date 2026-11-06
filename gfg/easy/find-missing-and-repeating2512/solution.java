
class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>(2);

        // Marking
        for (int i = 0; i < arr.length; i++) {
            int value = Math.abs(arr[i]);
            int position = value - 1;

            if (arr[position] > 0) {
                arr[position] = -arr[position];
            } else {
                ans.add(value); // Repeating number
            }
        }

        // Find missing number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans.add(i + 1);
                break;
            }
        }

        return ans;
    }
}
