# Combination Sum Without Repetition

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  and a  **target**, your task is to find all  **unique** combinations in the array where the sum of the elements is equal to target. Each element in arr[] can be used at most  **once** in the combination.

 **Note:** You can return your answer in any order, the driver code will print them in sorted order.
Test cases are generated such that number of unique combination does not exceed 106.

 **Examples:** 

```
Input: arr[] = [1, 2, 3], target = 5
Output: [[2, 3]]
Explanation: There is only one unique combinations whose sum is equal to the target.
```

```
Input: arr[] = [1, 3, 2, 2, 2], target = 4
Output: [[1, 3], [2, 2]]
Explanation: There are two unique possible combinations whose sum is equal to target.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 100
1 ≤ arr[i] ≤ 50
1 ≤ target ≤ 30

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T13:10:48.079Z  

```java
class Solution {
    static void solve(int[] candidates , int target , int index , ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> output) {
            // base case
            if (target == 0) {
                // target 0 ka mltb meri output wali list me ek answer bn chuka h 
                // then store this ans into ans wali list
                ans.add(new ArrayList(output));
                return;
            }

            if (index >= candidates.length) return;
            if (target < 0) return;

            // include - exclude pattern
            // include 
            output.add(candidates[index]);
            solve(candidates, target - candidates[index] , index+1 , ans , output);
            // backtracking wala step
            output.remove(output.size() - 1);

            // To generate the unique combinations
            while (index + 1 < candidates.length && candidates[index] == candidates[index+1]) index++;

            // exclude
            solve(candidates , target , index + 1, ans , output);
        }
    public ArrayList<ArrayList<Integer>> uniqueCombinations(int[] arr, int target) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();
        int index = 0;
        solve(arr , target , index , ans , output);
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/combination-sum-ii-1664263832/1)