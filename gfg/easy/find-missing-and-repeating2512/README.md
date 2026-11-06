# Missing And Repeating

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an unsorted array  **arr[]** of size  **n**, containing elements from the range  **1** to **n**, it is known that one number in this range is missing, and another number occurs twice in the array, find the both numbers.

**Examples:
**

```
Input: arr[] = [2, 2]
Output: [2, 1]
Explanation: Repeating number is 2 and the missing number is 1.
```

```
Input: arr[] = [1, 3, 3] 
Output: [3, 2]
Explanation: Repeating number is 3 and the missing number is 2.
```

```
Input: arr[] = [4, 3, 6, 2, 1, 1]
Output: [1, 5]
Explanation: Repeating number is 1 and the missing number is 5.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T17:38:21.839Z  

```java

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>(2);

        // Marking
        for (int i = 0; i < arr.length; i++) {
            int value = Math.abs(arr[i]);
            int position = value - 1;

            if (arr[position] > 0) {
                arr[position] = -arr[position];
            } else {
                ans.add(value); // Repeating number
            }
        }

        // Find missing number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans.add(i + 1);
                break;
            }
        }

        return ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1)