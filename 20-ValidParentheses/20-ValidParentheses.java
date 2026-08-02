// Last updated: 8/2/2026, 10:52:51 PM
1class Solution {
2    public boolean isValid(String s) {
3
4        Stack<Character> stack = new Stack<>();
5
6        for (char ch : s.toCharArray()) {
7
8            if (ch == '(' || ch == '[' || ch == '{') {
9                stack.push(ch);
10            } else {
11
12                if (stack.isEmpty()) {
13                    return false;
14                }
15
16                char top = stack.pop();
17
18                if ((ch == ')' && top != '(') ||
19                    (ch == ']' && top != '[') ||
20                    (ch == '}' && top != '{')) {
21                    return false;
22                }
23            }
24        }
25
26        return stack.isEmpty();
27    }
28}