# All String Permutations in Sorted Order

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given a string  **s**. Find all permutations  of a given string. Return the permutations in lexicographically non-decreasing order.

 **Examples :** 

```
Input: s = "AA"
Output: ["AA", "AA"]
Explanation: There are total 2 permutations, as given in the output.

```

```
Input: s = "ABC"
Output: ["ABC", "ACB", "BAC", "BCA", "CAB", "CBA"]
Explanation: There are total 6 permutations, as given in the output.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T16:04:08.961Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string-1587115620/1)