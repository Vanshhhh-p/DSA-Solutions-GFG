class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            list.add(arr[i]);
            i += 2;
        }
        return list;
    }
}