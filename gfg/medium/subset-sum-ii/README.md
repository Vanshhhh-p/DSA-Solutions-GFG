# Distinct Subsets

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array  **arr[]**  of positive integers (which may contain duplicates), your task is to find all the  **unique or distinct subsets**  of the array.

 **Note:** You can return the subsets in any order, the driver code will print them in sorted order.

 **Examples:** 

```
Input: arr[] = [1, 5, 6]
Output: [[], [1], [1, 5], [1, 5, 6], [1, 6], [5], [5, 6], [6]]
Explanation: The number of all the possible subsets will be 2n.
Now the unique subsets are [], [1], [1, 5], [1, 5, 6], [1, 6], [5], [5, 6], [6].
```

```
Input: arr[] = [1, 2, 2]
Output: [[], [1], [1, 2], [1, 2, 2], [2], [2, 2]]
Explanation: The number of all the possible subsets will be 2n.
Now the unique subsets are [], [1], [1, 2], [1, 2, 2], [2], [2, 2].
```

 **Constraints** 
1 ≤ arr.size() ≤ 15
1 ≤ arr[i] ≤  105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-18T16:51:27.799Z  

```java
class Solution {
    static void solve(int[] nums , int index , ArrayList<Integer> output , ArrayList<ArrayList<Integer>> ans) {
            // base case 
            if (index >= nums.length) {
                // subsequence ready hai -> ouput wali list m 
                // is subsequence ko store krna hai , ans me
                ans.add(new ArrayList<>(output));
                return;
            }   

            // include - exclude pattern 
            int currentValue = nums[index];
            // include 
            output.add(currentValue);
            solve(nums , index +1 , output, ans);
            // backtracking step
            output.remove(output.size() - 1);

            // while excluding, ignore the same elements an move on to the new elements
            // yeh exclude wala logic ek assumption pr based hai
            while (index + 1 < nums.length && nums[index] == nums[index +1]) index++;


            // exclude
            solve(nums , index+1 , output , ans);
        }
    public ArrayList<ArrayList<Integer>> findSubsets(int[] arr) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();

        int index = 0;
        solve (arr, index , output, ans);
        return ans;
        
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/subset-sum-ii/1)