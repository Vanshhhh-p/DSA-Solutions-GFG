class Solution {
    public void quickSort(int[] arr, int low, int high) {
        int s = low;
        int e = high;
        
        // base case 
        if (s >= e) return;
        
        // partitioning
        int pivotIndex = partition (arr, s , e);
        
        // Recursively sort left part
        quickSort(arr, s , pivotIndex-1);
        // Recursively sort right part
        quickSort(arr, pivotIndex+1 , e);
    }

    static void swap (int[] arr, int a , int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    private int partition(int[] arr, int low, int high) {
        // choose pivotIndex -> starting element , ending element , random element
        int s = low;
        int e = high;
        int pivotElement = arr[s];
        
        // pivot element should be placed at its correct position
        // count strategey || other -> lomuto n Hoare
        int count = 0;
        for (int i = s+1; i <= e; i++) {
            if (arr[i] <= pivotElement) {
                count++;
            }
        }
        
        int correctPosition = s + count;
        swap (arr, correctPosition , s);
        
        // Now make sure left -> smaller 'Pivot' right -> larger elements
        int i = s;
        int j = e;
        
        while (i < correctPosition && j > correctPosition) {
            // Ignore all the correct smaller elements in left part and increment i 
            while (arr[i] <= pivotElement) i++;
            
            // Ignore all the correct larger elements in right part and decrement j 
            while (arr[j] > pivotElement) j--;
            
            if (i < correctPosition && j > correctPosition) {
                swap(arr ,i , j);
                i++;
                j--;
            }
        }
        return correctPosition;
    }
}