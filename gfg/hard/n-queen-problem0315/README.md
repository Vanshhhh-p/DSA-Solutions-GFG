# N-Queen Problem

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

The N-Queens puzzle is the problem of placing N queens on an N * N chessboard such that no two queens attack each other. Two queens attack each other if they are placed in the same row, the same column, or the same diagonal.

Given an integer  **n** representing the number of queens, find all distinct solutions to this puzzle. Each solution should be represented as an array of size n, where the **ith**  element (1-based indexing) denotes the column position of the queen placed in the  **ith** row.

 **Note:**  You may return the solutions in any order.

 **Examples:** 

```
Input: n = 1
Output: [1]
Explanation: Only one queen can be placed in the single cell available.
```

```
Input: n = 4
Output: [[2, 4, 1, 3], [3, 1, 4, 2]]
Explanation: There are 2 possible solutions for n = 4.

```

```
Input: n = 3
Output: []
Explanation: There are no possible solutions for n = 3.
```

**Constraints:
**1 ≤ n ≤ 10

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T05:55:58.038Z  

```java

class Solution {

    static boolean isSafeToPlace(int row, int col, int n, char[][] board) {

        // Check left horizontal
        int r = row;
        int c = col;

        while (c >= 0) {
            if (board[r][c] == 'Q') {
                return false;
            }
            c--;
        }

        // Check left upper diagonal
        r = row;
        c = col;

        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r--;
            c--;
        }

        // Check left lower diagonal
        r = row;
        c = col;

        while (r < n && c >= 0) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r++;
            c--;
        }

        return true;
    }

    static void solve(char[][] board, int n, int col,
        ArrayList<ArrayList<Integer>> ans) {

        // Base case: all columns have queens
        if (col == n) {
            ArrayList<Integer> temp = new ArrayList<>();

            // Convert board into 1-based column positions
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 'Q') {
                        temp.add(j + 1);
                        break;
                    }
                }
            }

            ans.add(temp);
            return;
        }

        // Try placing a queen in every row of this column
        for (int row = 0; row < n; row++) {

            if (isSafeToPlace(row, col, n, board)) {

                // Place queen
                board[row][col] = 'Q';

                // Recursive call for next column
                solve(board, n, col + 1, ans);

                // Backtracking: remove queen
                board[row][col] = '.';
            }
        }
    }

    public ArrayList<ArrayList<Integer>> nQueen(int n) {

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        solve(board, n, 0, ans);

        return ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/n-queen-problem0315/1)