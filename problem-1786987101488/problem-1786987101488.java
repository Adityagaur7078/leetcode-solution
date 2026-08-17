// Last updated: 8/17/2026, 10:48:21 PM
1class Solution {
2    public String intToRoman(int num) {
3        int[] values = {
4            1000, 900, 500, 400,
5            100, 90, 50, 40,
6            10, 9, 5, 4, 1
7        };
8
9        String[] symbols = {
10            "M", "CM", "D", "CD",
11            "C", "XC", "L", "XL",
12            "X", "IX", "V", "IV", "I"
13        };
14
15        StringBuilder result = new StringBuilder();
16
17        for (int i = 0; i < values.length; i++) {
18
19            while (num >= values[i]) {
20                result.append(symbols[i]);
21                num -= values[i];
22            }
23        }
24
25        return result.toString();
26    }
27}