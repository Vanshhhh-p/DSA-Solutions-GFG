# Unique Number I

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a  **unsorted** array  **arr[]**  of positive integers having all the numbers occurring exactly  **twice**, except for one number which will occur only  **once**. Find the number occurring only once.

 **Examples :** 

```
Input: arr[] = [1, 2, 1, 5, 5]
Output: 2
Explanation: Since 2 occurs once, while other numbers occur twice, 2 is the answer.
```

```
Input: arr[] = [2, 30, 2, 15, 20, 30, 15]
Output: 20
Explanation: Since 20 occurs once, while other numbers occur twice, 20 is the answer.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T08:28:48.246Z  

```java
class Solution {
    public int findUnique(int[] arr) {
        int xorSum = 0;
        for (int i : arr) {
            xorSum ^= i;
        }
        return xorSum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-unique-number/1)