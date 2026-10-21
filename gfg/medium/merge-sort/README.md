# Merge Sort

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array arr[], its starting position l and its ending position r. Sort the array using the merge sort algorithm.

 **Examples:** 

```
Input: arr[] = [4, 1, 3, 9, 7]
Output: [1, 3, 4, 7, 9]
Explanation: We get the sorted array after using merge sort

```

```
Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Explanation: We get the sorted array after using merge sort 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T18:10:23.133Z  

```java
class Solution {
    static void merge (int[] arr, int s ,int e , int mid) {
        int leftArrLen = mid - s + 1;
        int rightArrLen = e - mid;
        
        int[] leftArr = new int[leftArrLen];
        int[] rightArr = new int[rightArrLen];
        
        // copy the left half content of arr into leftArr
        int k = s;
        for (int i = 0; i < leftArrLen; i++) {
            leftArr[i] = arr[k];
            k++;
        }
        
        // copy the rigth half content of arr into rightArr
        k = mid + 1;
        for (int j = 0; j < rightArrLen; j++) {
            rightArr[j] = arr[k];
            k++;
        }
        
        // merge ka exact logic
        int i = 0;
        int j = 0;
        k = s;
        while (i < leftArrLen && j < rightArrLen) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            }
            else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        
        // if left Array is fully consumed but not right 
        // then copy the remaining elements of right arr
        while (j < rightArrLen) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
        
        // if right Array is fully consumed but not right 
        // then copy the remaining elements of left arr
        while (i < leftArrLen) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
    }
    public void mergeSort(int arr[], int l, int r) {
        // base case
        int s = l;
        int e = r;
        
        if (s >= e) {
            // invalid array -> single element
            return;
        }
        int mid = s + (e - s) / 2;
        mergeSort(arr, s , mid);
        mergeSort(arr, mid+1, e);
        merge(arr, s , e , mid);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/merge-sort/1)