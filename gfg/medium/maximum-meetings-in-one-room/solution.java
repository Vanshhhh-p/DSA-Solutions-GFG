class Solution {
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
        ArrayList<Integer> ans = new ArrayList<>();
        int a[][] = new int[s.length][3];
        
        for (int i = 0; i < s.length; i++) {
            a[i][0] = i+1;
            a[i][1] = s[i];
            a[i][2] = f[i];
        }
        
        Arrays.sort(a , Comparator.comparingInt(o -> o[2]));
        int r = a[0][2];
        ans.add(a[0][0]);
        for (int i = 0; i < a.length; i++) {
            if (a[i][1] > r) {
                ans.add(a[i][0]);
                r = a[i][2];
            }
        }
        Collections.sort(ans);
        return ans;
    }
}