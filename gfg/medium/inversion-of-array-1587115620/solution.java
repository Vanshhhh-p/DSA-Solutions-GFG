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