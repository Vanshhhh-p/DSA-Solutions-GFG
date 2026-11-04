class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int i : a) {
            set1.add(i);
        }
        
        for (int j : b) {
            set2.add(j);
        }
    
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        
        return new ArrayList<>(union);
    }
}