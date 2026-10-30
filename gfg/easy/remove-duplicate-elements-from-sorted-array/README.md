# Remove Duplicates Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a sorted array  **arr[]** containing positive integers. Your task is to remove all duplicate elements from this array such that each element appears only once. Return an array containing these distinct elements in the same order as they appeared.

 **Examples :** 

```
Input: arr[] = [2, 2, 2, 2, 2]
Output: [2]
Explanation: After removing all the duplicates only one instance of 2 will remain i.e. [2] so modified array will contains 2 at first position and you should return array containing [2] after modifying the array.

```

```
Input: arr[] = [1, 2, 4]
Output: [1, 2, 4]
Explanation:  As the array does not contain any duplicates so you should return [1, 2, 4].
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T18:15:39.196Z  

```java
class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        int i = 0;
        int j = 1;

        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        if (n == 0) return ans;

        ans.add(arr[0]);

        while (j < n) {
            if (arr[i] == arr[j]) {
                j++;
            } 
            else {
                i++;
                arr[i] = arr[j];
                ans.add(arr[i]);
                j++;
            }
        }

        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1)