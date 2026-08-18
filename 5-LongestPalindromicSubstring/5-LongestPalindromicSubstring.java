// Last updated: 8/18/2026, 11:04:39 PM
1class Solution {
2    public String longestPalindrome(String s) {
3        if (s.length() < 2) {
4            return s;
5        }
6
7        String longest = "";
8
9        for (int i = 0; i < s.length(); i++) {
10
11            // Odd-length palindrome
12            String odd = expandAroundCenter(s, i, i);
13
14            // Even-length palindrome
15            String even = expandAroundCenter(s, i, i + 1);
16
17            if (odd.length() > longest.length()) {
18                longest = odd;
19            }
20
21            if (even.length() > longest.length()) {
22                longest = even;
23            }
24        }
25
26        return longest;
27    }
28
29    private String expandAroundCenter(String s, int left, int right) {
30
31        while (left >= 0 &&
32               right < s.length() &&
33               s.charAt(left) == s.charAt(right)) {
34
35            left--;
36            right++;
37        }
38
39        return s.substring(left + 1, right);
40    }
41}