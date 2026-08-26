// Last updated: 8/26/2026, 5:39:05 AM
1class Solution {
2    public int reverse(int x) {
3        int result = 0;
4
5        while (x != 0) {
6
7            int digit = x % 10;
8            x = x / 10;
9
10            if (result > Integer.MAX_VALUE / 10 ||
11                (result == Integer.MAX_VALUE / 10 && digit > 7)) {
12                return 0;
13            }
14
15            if (result < Integer.MIN_VALUE / 10 ||
16                (result == Integer.MIN_VALUE / 10 && digit < -8)) {
17                return 0;
18            }
19
20            result = result * 10 + digit;
21        }
22
23        return result;
24    }
25}