class Solution {
    public ArrayList<Integer> customSort(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < n/2; i++) {
            list1.add(arr[i]);
        }

        for (int i = n/2; i < n; i++) {
            list2.add(arr[i]);
        }

        Collections.sort(list1);
        Collections.sort(list2, Collections.reverseOrder());

        list1.addAll(list2);

        return list1;
    }
}
