# Rat in a Maze

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a binary matrix  **maze[][]**  of size **n × n**  containing values  **0**  and  **1**, find all possible paths for a rat to travel from the source cell (0, 0) to the destination cell (n - 1, n - 1). The rat can move in four directions: up(U), down(D), left(L), and right(R).

- 1 represents an open cell through which the rat can move.
- 0 represents a blocked cell that cannot be traversed.

The rat can move only through open cells and cannot visit the same cell more than once in a path. Return all valid paths as strings consisting of 'U', 'D', 'L', and 'R', representing the sequence of moves taken by the rat.

 **Note:**  Return the paths in lexicographically increasing order. If no valid path exists, return an empty list.

 **Examples:** 

```
Input: maze[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}}
Output: ["DDRDRR", "DRDDRR"]
Explanation: There are two valid paths from the source cell (0, 0) to the destination cell (3, 3).

```

```
Input: maze[][] = [[1, 0], [1, 0]]
Output: []
Explanation: No path exists as the destination cell (1, 1) is blocked.

```

 **Constraints:** 
2 ≤ n ≤ 5
0 ≤ maze[i][j] ≤ 1

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T07:09:37.448Z  

```java
class Solution {
    static boolean isSafeMovement(int newX,int newY,int n ,int[][] maze,boolean[][] visited) {
        if (newX < 0 || newX >= n || newY < 0 || newY >= n) return false; // out of bound case
        else if (maze[newX][newY] == 0) return false; // blocked cell case
        else if (visited[newX][newY] == true) return false; // already visited case
        else return true;
    }
    static void solve(int[][] maze , int srcX, int srcY, int destX, int destY, boolean[][] visited ,ArrayList<String> ans,String path) {
        // base case
        if (srcX == destX && srcY == destY) {
            ans.add(path);
            return;
        }
        
        visited[srcX][srcY] = true;
        int n = maze.length;
        
        // ab i have four movements
        // Up
        int newX = srcX+1;
        int newY = srcY;
        if (isSafeMovement(newX, newY, n , maze, visited)) {
            // baki recursion sambhal lega
            solve (maze , newX, newY , destX, destY, visited,ans, path + "D");
        }
        // Down
        newX = srcX-1;
        newY = srcY;
        if (isSafeMovement(newX, newY, n , maze, visited)) {
            // baki recursion sambhal lega
            solve (maze , newX, newY , destX, destY, visited, ans,path + "U");
        }
        // Left
        newX = srcX;
        newY = srcY-1;
        if (isSafeMovement(newX, newY, n , maze, visited)) {
            // baki recursion sambhal lega
            solve (maze , newX, newY , destX, destY, visited,ans, path + "L");
        }
        // Right
        newX = srcX;
        newY = srcY+1;
        if (isSafeMovement(newX, newY, n , maze, visited)) {
            // baki recursion sambhal lega
            solve (maze , newX, newY , destX, destY, visited,ans, path + "R");
        }
        
        // kyuki maine charo dirsction try krli 
        // and abh mujhe wapis return krna hai
        // to abh mujhe undo wala step krna pdega 
        // undo wala step -> backtracking wala step
        visited[srcX][srcY] = false;
        // yeh me har baar bhul jata hu
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        int srcX = 0;
        int srcY = 0;
        
        int n = maze.length;
        
        int destX = n-1;
        int destY = n-1;
        
        boolean[][] visited = new boolean[n][n];
        ArrayList<String> ans = new ArrayList<>();
        
        String path = "";
        
        // if src location cell is a blocked cell or destnation cell is a blocked cell
        if (maze[0][0] == 0 || maze[n-1][n-1] == 0) return ans;
        
        solve(maze , srcX, srcY, destX, destY, visited , ans , path);
        Collections.sort(ans);
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1)