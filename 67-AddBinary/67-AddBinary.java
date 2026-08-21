// Last updated: 8/21/2026, 7:11:15 AM
1class Solution {
2    public String addBinary(String a, String b) {
3        
4        int i = a.length() - 1;
5        int j = b.length() - 1;
6
7        int carry = 0;
8
9        StringBuilder result = new StringBuilder();
10
11        while (i >= 0 || j >= 0 || carry != 0) {
12
13            int sum = carry;
14
15            if (i >= 0) {
16                sum += a.charAt(i) - '0';
17                i--;
18            }
19
20            if (j >= 0) {
21                sum += b.charAt(j) - '0';
22                j--;
23            }
24
25            result.append(sum % 2);
26
27            carry = sum / 2;
28        }
29
30        return result.reverse().toString();
31    }
32}