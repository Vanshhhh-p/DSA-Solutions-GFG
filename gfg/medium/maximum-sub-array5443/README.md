# Max Sum Subarray of Non-Negative

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers  **arr[]**, find the contiguous subarray with the maximum sum that contains only non-negative numbers.

- If multiple subarrays have the same maximum sum return the one with longest length.
- If there is still a tie, return the subarray with the smallest starting index.
- If the array contains only negative numbers, return -1.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, -1, 6]
Output: [1, 2, 3]
Explanation: The valid non-negative subarrays [1, 2, 3] and [6] both have a sum of 6. Since [1, 2, 3] has the longer length, it is selected.

```

```
Input: arr[] = [-1, 2]
Output: [2]
Explanation: The only valid non-negative subarray is [2], so the output is [2].

```

```
Input: arr[] = [1, 2, 5, -7, 2, 6]
Output: [1, 2, 5]
Explanation: The valid non-negative subarrays are [1, 2, 5] and [2, 6]. Both have the same sum of 8, but [1, 2, 5] starts earlier and also longest one so it is the preferred subarray.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T13:34:08.124Z  

```java

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        long sum = 0, maxSum = -1;
        int start = 0, bestStart = -1, bestEnd = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sum = 0;
                start = i + 1;
            } else {
                sum += arr[i];

                if (sum > maxSum ||
                    (sum == maxSum && i - start > bestEnd - bestStart)) {
                    maxSum = sum;
                    bestStart = start;
                    bestEnd = i;
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        if (bestStart == -1) {
            ans.add(-1);
            return ans;
        }

        for (int i = bestStart; i <= bestEnd; i++) {
            ans.add(arr[i]);
        }

        return ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-sub-array5443/1)