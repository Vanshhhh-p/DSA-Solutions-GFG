# Max Same Consecutive

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array **arr[]** consisting of only 0’s and 1’s, return count of the maximum number of consecutive 1’s or 0’s present in the array. 

 **Examples:** 

```
Input: arr[] = [0, 1, 0, 1, 1, 1, 1]
Output: 4
Explanation: The maximum number of consecutive 1’s in the array is 4 from index 3-6.
```

```
Input: arr[] = [0, 0, 1, 0, 1, 0]
Output: 2
Explanation: The maximum number of consecutive 0’s in the array is 2 from index 0-1.
```

```
Input: arr[] = [0, 0, 0, 0]
Output: 4
Explanation: The maximum number of consecutive 0’s in the array is 4.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-23T16:58:43.163Z  

```java

class Solution {
    public int maxConsecBits(int[] arr) {
        int countOnes = 0;
        int countZeroes = 0;
        int maxOnes = 0;
        int maxZeroes = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                countOnes++;
                countZeroes = 0;
            } else {
                countZeroes++;
                countOnes = 0;
            }

            // Update maximum inside the loop
            maxOnes = Math.max(maxOnes, countOnes);
            maxZeroes = Math.max(maxZeroes, countZeroes);
        }

        return Math.max(maxOnes, maxZeroes);
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/max-consecutive-one/1)