# Maximum Meetings in One Room

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two arrays  **s[]**  and  **f[]**, where  **s[i]**  and  **f[i]**  denote the start time and finish time of the ith meeting, respectively. There is only one meeting room. A meeting can be scheduled only if its start time is strictly greater than the finish time of the previously selected meeting.

Find the maximum number of meetings that can be scheduled in the room such that no two selected meetings overlap. Return the indices (1-based) of the selected meetings in sorted (increasing) order.

 **Note:** If multiple schedules are possible, prefer meetings with earlier finish times. If two meetings have the same finish time, prefer the meeting with the smaller index.

 **Examples:** 

```
Input: s[] = [1, 3, 0, 5, 8, 5], f[] = [2, 4, 6, 7, 9, 9] 
Output: [1, 2, 4, 5]
Explanation: We can attend the 1st meeting from (1 to 2), then the 2nd meeting from (3 to 4), then the 4th meeting from (5 to 7), and the last meeting we can attend is the 5th from (8 to 9). It can be shown that this is the maximum number of meetings we can attend.
```

```
Input: s[] = [3], f[] = [7]
Output: [1]
Explanation: Since there is only one meeting, we can attend the meeting.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-24T08:48:26.961Z  

```java
class Solution {
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
        ArrayList<Integer> ans = new ArrayList<>();
        int a[][] = new int[s.length][3];
        
        for (int i = 0; i < s.length; i++) {
            a[i][0] = i+1;
            a[i][1] = s[i];
            a[i][2] = f[i];
        }
        
        Arrays.sort(a , Comparator.comparingInt(o -> o[2]));
        int r = a[0][2];
        ans.add(a[0][0]);
        for (int i = 0; i < a.length; i++) {
            if (a[i][1] > r) {
                ans.add(a[i][0]);
                r = a[i][2];
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-meetings-in-one-room/1)