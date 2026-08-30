// Last updated: 8/30/2026, 8:51:58 AM
1class Solution {
2    public int mySqrt(int x) {
3        if (x < 2) {
4            return x;
5        }
6
7        int left = 1;
8        int right = x / 2;
9        int ans = 0;
10
11        while (left <= right) {
12            int mid = left + (right - left) / 2;
13            long square = (long) mid * mid;
14
15            if (square == x) {
16                return mid;
17            } else if (square < x) {
18                ans = mid;
19                left = mid + 1;
20            } else {
21                right = mid - 1;
22            }
23        }
24
25        return ans;
26    }
27}