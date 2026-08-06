// Last updated: 8/6/2026, 10:44:07 PM
1class Solution {
2    public int romanToInt(String s) {
3        Map<Character, Integer> map = new HashMap<>();
4        map.put('I', 1);
5        map.put('V', 5);
6        map.put('X', 10);
7        map.put('L', 50);
8        map.put('C', 100);
9        map.put('D', 500);
10        map.put('M', 1000);
11
12        int result = 0;
13
14        for (int i = 0; i < s.length(); i++) {
15            int current = map.get(s.charAt(i));
16            
17            if (i < s.length() - 1 && current < map.get(s.charAt(i + 1))) {
18                result -= current;
19            } else {
20                result += current;
21            }
22        }
23
24        return result;
25    }
26}