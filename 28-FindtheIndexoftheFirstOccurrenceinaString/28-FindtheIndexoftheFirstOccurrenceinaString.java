// Last updated: 8/15/2026, 11:38:36 PM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        if (needle.length() > haystack.length()) {
4            return -1;
5        }
6        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
7            int j = 0;
8            while (j < needle.length() &&
9                   haystack.charAt(i + j) == needle.charAt(j)) {
10                j++;
11            }
12            if (j == needle.length()) {
13                return i;
14            }
15        }
16        return -1;
17    }
18}