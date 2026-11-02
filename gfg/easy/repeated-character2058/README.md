# Repeated Character

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s** consisting of lowercase English letters, find the first character that repeats in the string.

 **Note:**  If the string contains no repeating characters, return '#'.

 **Examples :** 

```
Input: s = "geeksforgeeks"
Output: g
Explanation: g, e, k and s are the repeating characters. Out of these, g occurs first. 

```

```
Input: s = "abcde"
Output: '#'
Explanation: No repeating character present, so return '#'.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-02T04:40:45.261Z  

```java
class Solution {
    char firstRep(String s) {
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) return s.charAt(i);
                
            }
        }
        return '#';
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/repeated-character2058/1)