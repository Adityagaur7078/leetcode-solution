// Last updated: 8/20/2026, 10:37:35 PM
1class Solution {
2    public int lengthOfLastWord(String s) {
3
4        int i = s.length() - 1;
5
6        // Skip spaces at the end
7        while (i >= 0 && s.charAt(i) == ' ') {
8            i--;
9        }
10
11        int count = 0;
12
13        // Count the last word
14        while (i >= 0 && s.charAt(i) != ' ') {
15            count++;
16            i--;
17        }
18
19        return count;
20    }
21}