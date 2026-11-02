# Reverse a String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, reverse the string.

 **Examples:** 

```
Input: s = "Geeks"
Output: "skeeG"

```

```
Input: s = "for"
Output: "rof"
```

```
Input: s = "a"
Output: "a"
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-02T03:56:51.273Z  

```java
class Solution {
    public static String reverseString(String s) {
        if (s == null || s.isEmpty()) return s;
        
        int len = s.length();
        char[] result = new char[len];
        
        int left = 0;
        int right = len -1;
        
        while (left <= right) {
            result[left] = s.charAt(right);
            result[right] = s.charAt(left);
            
            left++;
            right--;
        }
        return new String(result);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-a-string/1)