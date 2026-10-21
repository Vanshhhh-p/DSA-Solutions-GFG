
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
