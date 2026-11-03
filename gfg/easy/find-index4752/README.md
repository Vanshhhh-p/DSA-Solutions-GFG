# First and Last in Unosrted

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an unsorted array  **arr[]**  of integers and a  **key**  which is present in this array. Find the  **start index** (index where the element is first found from left in the array) and  **end index** (index where the element is first found from right in the array). Return an array of length 2 with elements start index and end index.

 **Note:** If the key does not exist in the array then return -1 for both start and end index.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 5, 5], key = 5
Output: [4, 5]
Explanation: 5 appears first time at index 4 and appears last time at index 5.

```

```
Input: arr = [6, 5, 4, 3, 1, 2], key = 4
Output: [2, 2]
Explanation: 4 appears first time and last time at index 2.

```

```
Input: arr = [7, 8, 6], key = 2
Output: [-1, -1]
Explanation: Since 2 does not appear in the array, we will return -1 for both the start and end indices.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T07:44:17.006Z  

```java
class Solution {
    public ArrayList<Integer> findIndex(int[] arr, int key) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (ans.isEmpty()) {
                    ans.add(i); // First occurrence (Index 0)
                    ans.add(i); // Assume it's also the last occurrence for now (Index 1)
                } else {
                    ans.set(1, i); // Update the last occurrence at Index 1
                }
            }
        }

        // If the loop finished and nothing was found, fill it with -1
        if (ans.isEmpty()) {
            ans.add(-1);
            ans.add(-1);
        }

        return ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-index4752/1)