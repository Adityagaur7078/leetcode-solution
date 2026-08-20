# Integer to Roman

## Problem

Given an integer, convert it to its corresponding **Roman numeral**.

Roman numerals use the following symbols:

| Symbol | Value |
| :----: | ----: |
|    I   |     1 |
|    V   |     5 |
|    X   |    10 |
|    L   |    50 |
|    C   |   100 |
|    D   |   500 |
|    M   |  1000 |

## Roman Numeral Rules

Roman numerals are constructed from the highest decimal place value to the lowest.

### 1. Standard Form

If a value does not begin with `4` or `9`, use the largest Roman numeral value that can be subtracted from it.

For example:

```text
8 = 5 + 1 + 1 + 1
  = VIII
```

### 2. Subtractive Form

When a decimal place begins with `4` or `9`, use a subtractive form.

The only valid subtractive combinations are:

| Value | Roman |
| ----: | :---: |
|     4 |   IV  |
|     9 |   IX  |
|    40 |   XL  |
|    90 |   XC  |
|   400 |   CD  |
|   900 |   CM  |

### 3. Repetition Rule

Only `I`, `X`, `C`, and `M` can be repeated, and at most **three consecutive times**.

```text
III = 3
XXX = 30
CCC = 300
MMM = 3000
```

`V`, `L`, and `D` cannot be repeated.

Instead of writing a symbol four times, use subtractive notation:

```text
4   → IV
40  → XL
400 → CD
```

---

## Examples

### Example 1

**Input:**

```text
num = 3749
```

**Output:**

```text
"MMMDCCXLIX"
```

**Explanation:**

```text
3000 = MMM
 700 = DCC
  40 = XL
   9 = IX
```

Therefore:

```text
3749 = MMM + DCC + XL + IX
     = MMMDCCXLIX
```

> Note: `49` is **not** represented as `IL`. Roman numeral conversion is based on individual decimal place values.

---

### Example 2

**Input:**

```text
num = 58
```

**Output:**

```text
"LVIII"
```

**Explanation:**

```text
50 = L
 8 = VIII
```

Therefore:

```text
58 = L + VIII
   = LVIII
```

---

### Example 3

**Input:**

```text
num = 1994
```

**Output:**

```text
"MCMXCIV"
```

**Explanation:**

```text
1000 = M
 900 = CM
  90 = XC
   4 = IV
```

Therefore:

```text
1994 = M + CM + XC + IV
     = MCMXCIV
```

---

## Approach

A simple and reliable approach is to maintain Roman numeral values in **descending order**:

```text
1000 → M
900  → CM
500  → D
400  → CD
100  → C
90   → XC
50   → L
40   → XL
10   → X
9    → IX
5    → V
4    → IV
1    → I
```

For each value:

1. Check whether the number is greater than or equal to that value.
2. If it is, append the corresponding Roman symbol.
3. Subtract the value from the number.
4. Continue until the number becomes `0`.

This automatically handles both normal and subtractive notation.

## Complexity

Let `n` be the input number.

* **Time:** `O(n)` in the general repeated-subtraction interpretation.
* **Space:** `O(1)` auxiliary space, excluding the output string.

For the standard Roman numeral constraint (`1 <= num <= 3999`), the number of generated symbols is bounded, so this is effectively **constant time**.

## Key Takeaways

* Convert from **largest value to smallest**.
* Handle `4` and `9` using subtractive notation.
* Only these subtractive forms are valid:

```text
IV, IX, XL, XC, CD, CM
```

* Never use invalid forms such as:

```text
IL
IC
XD
XM
```

* Decimal place decomposition is important: `49` becomes `XLIX`, not `IL`.