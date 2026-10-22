# Count Inversions

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers  **arr[]**. You have to find the Inversion Count of the array. Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].

 **Examples:** 

```
Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
```

```
Input: arr[] = [2, 3, 4, 5, 6]
Output: 0
Explanation: As the sequence is already sorted so there is no inversion count.
```

```
Input: arr[] = [10, 10, 10]
Output: 0
Explanation: As all the elements of array are same, so there is no inversion count.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T04:13:11.174Z  

```java
class Solution {
    static int merge (int[] arr, int s , int e , int mid) {
        int leftArrLen = mid - s + 1;
        int rightArrLen = e - mid;
        
        int leftArr[] = new int[leftArrLen]; 
        int rightArr[] = new int[rightArrLen];
        
        int k = s;
        for (int i = 0; i < leftArrLen; i++) {
            leftArr[i] = arr[k];
            k++;
        }
        
        k = mid + 1;
        for (int j = 0; j < rightArrLen; j++) {
            rightArr[j] = arr[k];
            k++;
        }
        
        // merge ka logic 
        int i = 0;
        int j = 0;
        k = s;
        int inversionCount = 0;
        
        while (i < leftArrLen && j < rightArrLen) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                k++;
                i++;
            }
            else {
                // leftArr[i] > rightArr[j]
                // merge logic
                arr[k] = rightArr[j];
                j++;
                k++;
                
                // inversion logic
                inversionCount = inversionCount + (leftArrLen - i);
            }
        }

        while (i < leftArrLen) {
            arr[k] = leftArr[i];
                k++;
                i++;
        }
        while (j < rightArrLen) {
            arr[k] = rightArr[j];
                k++;
                j++;
        }
        return inversionCount;
    }
    static int mergeSort(int[] arr, int s , int e) {
        if (s > e) {
            return 0;
        }
        
        if (s == e) {
            return 0;
        }
        
        int mid = s + (e - s) / 2;
        
        // Recursively sort left arr
        int leftInversions = mergeSort(arr, s , mid);
        
        // Recursively sort right arr
        int rightInversions = mergeSort(arr, mid + 1, e);
        
        // merge step
        int intermediateInversion = merge(arr, s, e , mid);
        return (leftInversions+rightInversions+intermediateInversion);
    }
    public int inversionCount(int arr[]) {
        int countInversions = mergeSort(arr, 0, arr.length-1);
        return countInversions;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/1)