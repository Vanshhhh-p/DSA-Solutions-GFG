class Solution {
    static void solve(String s, String output, ArrayList<String> ans) {
        // agar meri input string and remaining string empty aayi h
        // iska mtlb ouput string me permutaion ready h 
        // use ans wali list me store krlo and chalo wapis
        
        // base case
        if(s.isEmpty()) {
            ans.add(output);
            return;
        }
        
        // hr character ko current position pr try krke dekho
        // and baaki recursion ko dedo
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String remString = s.substring(0,i) + s.substring(i+1);
            // baaki recursion dekh lega
            solve(remString, output + ch, ans);
        }
    }
    public ArrayList<String> permutation(String s) {
        ArrayList<String> ans = new ArrayList<>();
        solve(s , "", ans);
        Collections.sort(ans);
        return ans;
    }
}