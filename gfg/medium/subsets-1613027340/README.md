# Subsets

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  of distinct positive integers, your task is to find all its subsets.

 **Note:** You can return the subsets in any order, the driver code will print them in sorted order.

 **Examples:** 

```
Input: arr[] = [1, 2, 3]
Output: [[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]
Explanation: 
The subsets of [1, 2, 3] in lexicographical order are:
[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]
```

```
Input: arr[] = [2, 4]
Output: [[], [2], [2, 4], [4]]
Explanation:
The subsets of [2, 4] in lexicographical order are:
[], [2], [2, 4], [4]
```

 **Constraints :** 
1 ≤ arr.size() ≤ 10
1 ≤ arr[i] ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T12:30:47.068Z  

```java

class Solution {

    static void solve(int[] nums, int index,
                      ArrayList<Integer> output,
                      ArrayList<ArrayList<Integer>> ans) {

        // Base case
        if (index >= nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }

        int currentValue = nums[index];

        // Include
        output.add(currentValue);
        solve(nums, index + 1, output, ans);

        // Backtracking: remove the last added element
        output.remove(output.size() - 1);

        // Exclude
        solve(nums, index + 1, output, ans);
    }

    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();

        int index = 0;
        solve(arr, index, output, ans);

        return ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/subsets-1613027340/1)