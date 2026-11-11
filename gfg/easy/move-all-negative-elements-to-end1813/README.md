# Move all Negatives to End

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an unsorted array  **arr[ ]**  having both negative and positive integers. Place all negative elements at the end of the array without changing the order of positive elements and negative elements.

 **Note** : Don't return any array, just in-place on the array.

 **Examples:** 

```
Input : arr[] = [1, -1, 3, 2, -7, -5, 11, 6 ]
Output : [1, 3, 2, 11, 6, -1, -7, -5]
Explanation: By doing operations we separated the integers without changing the order.
```

```
Input : arr[] = [-5, 7, -3, -4, 9, 10, -1, 11]
Output : [7, 9, 10, 11, -5, -3, -4, -1]

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-11T19:26:55.185Z  

```java
class Solution {
    public void segregateElements(int arr[]) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

        // Store positive and zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[index++] = arr[i];
            }
        }

        // Store negative elements
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[index++] = arr[i];
            }
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1)