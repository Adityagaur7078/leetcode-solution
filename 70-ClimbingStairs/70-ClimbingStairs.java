// Last updated: 8/31/2026, 10:10:29 PM
1class Solution {
2    public int climbStairs(int n) {
3        if (n <= 2) {
4            return n;
5        }
6
7        int prev2 = 1;
8        int prev1 = 2;
9
10        for (int i = 3; i <= n; i++) {
11
12            int current = prev1 + prev2;
13
14            prev2 = prev1;
15            prev1 = current;
16        }
17
18        return prev1;
19    }
20}