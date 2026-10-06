import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.isEmpty()) {
            return result;
        }

        String[] mapping = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        backtrack(digits, 0, new StringBuilder(), mapping, result);

        return result;
    }

    private void backtrack(
        String digits,
        int index,
        StringBuilder current,
        String[] mapping,
        List<String> result
    ) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = mapping[digit];

        for (char letter : letters.toCharArray()) {
            current.append(letter);

            backtrack(digits, index + 1, current, mapping, result);

            current.deleteCharAt(current.length() - 1);
        }
    }
}