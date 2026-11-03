# Most Frequent in Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array  **arr[]**, return the element which occurs maximum times. If multiple such elements exists return the maximum element.

 **Example:** 

```
Input: arr[] = [1, 2, 2, 2, 4, 1]
Output: 2
Explanation: 2 is most frequent element of this array with 3 occurrences.
```

```
Input: arr[] = [1, -5, 8, 1]
Output: 1
Explanation: 1 is most frequent element of this array with 2 occurrences.
```

```
Input: arr[] = [3, 0, 0, 3, 8]
Output: 3
Explanation: 0 and 3 are two most frequent elements of this array. 3 is the maximum one.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T18:23:39.187Z  

```java
class Solution {
    public int mostFreqEle(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        int maxFreq = -1;
        int maxFreqKey = -1;

        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentKeyFreq = freq.get(key);

            if (currentKeyFreq > maxFreq ||
               (currentKeyFreq == maxFreq && currentKey > maxFreqKey)) {
                maxFreq = currentKeyFreq;
                maxFreqKey = currentKey;
            }
        }

        return maxFreqKey;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/most-frequent-element-in-an-array/1)