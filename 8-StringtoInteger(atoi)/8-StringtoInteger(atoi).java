// Last updated: 8/22/2026, 11:41:35 PM
1class Solution {
2    public int myAtoi(String s) {
3        
4        int i = 0;
5        int n = s.length();
6
7        while (i < n && s.charAt(i) == ' ') {
8            i++;
9        }
10
11        int sign = 1;
12
13        if (i < n && s.charAt(i) == '-') {
14            sign = -1;
15            i++;
16        } else if (i < n && s.charAt(i) == '+') {
17            i++;
18        }
19
20        int result = 0;
21
22        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
23
24            int digit = s.charAt(i) - '0';
25
26            if (result > Integer.MAX_VALUE / 10 ||
27                (result == Integer.MAX_VALUE / 10 &&
28                 digit > 7)) {
29
30                return sign == 1
31                    ? Integer.MAX_VALUE
32                    : Integer.MIN_VALUE;
33            }
34
35            result = result * 10 + digit;
36
37            i++;
38        }
39
40        return result * sign;
41    }
42}