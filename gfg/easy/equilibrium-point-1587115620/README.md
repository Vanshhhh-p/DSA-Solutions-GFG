# Equilibrium Point

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of integers **arr[]**, the task is to find the first equilibrium point in the array.

The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is the same as the sum of elements after it. Return -1 if no such point exists. 

 **Examples:** 

```
Input: arr[] = [1, 2, 0, 3]
Output: 2 
Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 3.
```

```
Input: arr[] = [1, 1, 1, 1]
Output: -1
Explanation: There is no equilibrium index in the array.

```

```
Input: arr[] = [-7, 1, 5, 2, -4, 3, 0]
Output: 3
Explanation: The sum of left of index 3 is -7 + 1 + 5 = -1 and sum on right of index 3 is -4 + 3 + 0 = -1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-08T18:19:30.209Z  

```java
class Solution {
    public static int findEquilibrium(int arr[]) {
        int n = arr.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        leftSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i-1] + arr[i];
        }
        rightSum[n-1] = arr[n-1];
        for (int i = n-2; i >=0; i--) {
            rightSum[i] = rightSum[i+1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            if (leftSum[i] == rightSum[i]) return i;
        }

        return -1;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1)