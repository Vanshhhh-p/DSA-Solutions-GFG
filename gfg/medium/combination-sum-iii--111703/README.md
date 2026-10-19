# Unique K-Number Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two integers  **n**  and  **k**, the task is to find all valid combinations of  **k**  numbers that adds up to  **n**  based on the following conditions:

- Only numbers from the range [1, 9] used.
- Each number can only be used at most once.

 **Note:**  You can return the combinations in any order, the driver code will print them in sorted order.

 **Examples:** 

```
Input: n = 9, k = 3
Output: [[1, 2, 6], [1, 3, 5], [2, 3, 4]]
Explanation: There are three valid combinations of 3 numbers that sum to 9: [1,2, 6], [1, 3, 5] and [2, 3, 4].
```

```
Input: n = 3, k = 3
Output: []
Explanation: It is not possible to pick 3 distinct numbers from 1 to 9 that sum to 3, so no valid combinations exist.
```

 **Constraints:** 
1 ≤ n ≤ 50
1 ≤ k ≤ 9

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T13:27:18.062Z  

```java
class Solution {
    static void solve(int[] candidates , int target , int index , ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> output,int count ,int k) {
                // base case
                if (count > k) return;
                if (count == k && target == 0) {
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
                solve(candidates, target - candidates[index] , index+1 , ans , output, count+1, k);
                // backtracking wala step
                output.remove(output.size() - 1);

                // To generate the unique combinations
                while (index + 1 < candidates.length && candidates[index] == candidates[index+1]) index++;

                // exclude
                solve(candidates , target , index + 1, ans , output, count, k);
            }
    public ArrayList<ArrayList<Integer>> combinationSum(int n, int k) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
                ArrayList<Integer> output = new ArrayList<>();
                int index = 0;
                int target = n;
                int[] arr = {1,2,3,4,5,6,7,8,9};
                int count = 0;
                solve(arr , target , index , ans , output, count, k);
                return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/combination-sum-iii--111703/1)