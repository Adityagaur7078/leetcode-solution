Roman numerals are represented by seven different symbols:

| Symbol | Value |
|--------|------:|
| I | 1 |
| V | 5 |
| X | 10 |
| L | 50 |
| C | 100 |
| D | 500 |
| M | 1000 |

For example:

- `2` is written as `II`.
- `12` is written as `XII` (`X + II`).
- `27` is written as `XXVII` (`XX + V + II`).

Roman numerals are generally written from **largest to smallest** from left to right. However, there are special cases where a smaller numeral appears before a larger one, indicating subtraction.

### Subtractive Cases

There are only six valid subtractive combinations:

- `I` before `V` or `X` → `IV = 4`, `IX = 9`
- `X` before `L` or `C` → `XL = 40`, `XC = 90`
- `C` before `D` or `M` → `CD = 400`, `CM = 900`

Given a Roman numeral, convert it to its integer value.

---

## Examples

### Example 1

**Input**
```text
s = "III"
```

**Output**
```text
3
```

**Explanation**

`III = 3`

---

### Example 2

**Input**
```text
s = "LVIII"
```

**Output**
```text
58
```

**Explanation**

- `L = 50`
- `V = 5`
- `III = 3`

Total = **58**

---

### Example 3

**Input**
```text
s = "MCMXCIV"
```

**Output**
```text
1994
```

**Explanation**

- `M = 1000`
- `CM = 900`
- `XC = 90`
- `IV = 4`

Total = **1994**

---

## Constraints

- `1 <= s.length <= 15`
- `s` contains only the characters:
  ```
  I, V, X, L, C, D, M
  ```
- It is guaranteed that `s` is a valid Roman numeral in the range **[1, 3999]**.