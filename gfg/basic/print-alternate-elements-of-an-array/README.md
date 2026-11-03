# Alternates in Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given an array **arr[]**, the task is to return a list elements of arr in alternate order (starting from index 0).

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4]
Output: 1 3
Explanation:
Take first element: 1
Skip second element: 2
Take third element: 3
Skip fourth element: 4
```

```
Input: arr[] = [1, 2, 3, 4, 5]
Output: 1 3 5
Explanation:
Take first element: 1
Skip second element: 2
Take third element: 3
Skip fourth element: 4
Take fifth element: 5
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T17:42:14.925Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1)