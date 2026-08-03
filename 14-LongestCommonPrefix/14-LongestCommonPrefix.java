// Last updated: 8/3/2026, 10:11:34 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        if (strs == null || strs.length == 0) {
4            return "";
5        }
6        String first = strs[0];
7        for (int i = 0; i < first.length(); i++) {
8            char ch = first.charAt(i);
9            for (int j = 1; j < strs.length; j++) {
10                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
11                    return first.substring(0, i);
12                }
13            }
14        }
15        return first;
16    }
17}