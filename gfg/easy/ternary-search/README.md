# Minimum in Decreasing Increasing Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  that  **strictly decreases**  and then  **strictly increases**, the array is said to be V-shaped or unimodal. Find the  **index** of the  **minimum**  element present in the array.

 **Examples:** 

```
Input: arr[] = [9, 7, 5, 2, 4, 6, 10]
Output: 3
Explanation: The minimum of the given array is 2, which is at index 3.
```

```
Input: arr[] = [10, 8, 6, 5, 2, 12, 14]
Output: 4
Explanation: The minimum of the given array is 2, which is at index 4.
```

 **Constraint:** 
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T17:35:48.286Z  

```java
class Solution {
    public int findMinIndex(int[] arr) {
        int n = arr.length;
        int count = 1;

        for (int i = 0; i < n-1; i++) {
            if (arr[i] < arr[i+1]) {
                return i;
            }
            count++;
        }
        
        if (count == n) {
            return n-1;
        }
        else return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/ternary-search/1)