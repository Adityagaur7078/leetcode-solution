// Last updated: 8/28/2026, 4:35:33 AM
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        
4        List<String> result = new ArrayList<>();
5
6        StringBuilder current = new StringBuilder();
7
8        backtrack(result, current, 0, 0, n);
9
10        return result;
11    }
12
13    private void backtrack(
14        List<String> result,
15        StringBuilder current,
16        int open,
17        int close,
18        int n
19    ) {
20
21        if (current.length() == 2 * n) {
22            result.add(current.toString());
23            return;
24        }
25
26        if (open < n) {
27            current.append('(');
28
29            backtrack(result, current, open + 1, close, n);
30
31            current.deleteCharAt(current.length() - 1);
32        }
33
34        if (close < open) {
35            current.append(')');
36
37            backtrack(result, current, open, close + 1, n);
38
39            current.deleteCharAt(current.length() - 1);
40        }
41    }
42}