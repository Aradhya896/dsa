# Sum of Beauty of All Substrings

## Problem Statement

The beauty of a string is defined as:

Difference between the frequency of the most frequent character and the
least frequent character (excluding characters that do not appear).

Given a string `s`, return the sum of beauty values of all possible
substrings of `s`.

------------------------------------------------------------------------

## Examples

### Example 1

**Input:**

    s = "xyx"

**Output:**

    1

**Explanation:** Substrings: - "x" → beauty = 0\
- "y" → beauty = 0\
- "x" → beauty = 0\
- "xy" → beauty = 0\
- "yx" → beauty = 0\
- "xyx" → frequencies: x:2, y:1 → beauty = 2 - 1 = 1

Total sum = 1

------------------------------------------------------------------------

### Example 2

**Input:**

    s = "aabcbaa"

**Output:**

    17

**Explanation:** Various substrings such as "aabc", "bcba", etc., have
non-zero beauty values. Summing all gives 17.

------------------------------------------------------------------------

# Approach

## Algorithm

1.  Loop through all possible starting indices of substrings.
2.  Maintain a frequency map for characters.
3.  Extend the substring one character at a time.
4.  For each substring:
    -   Find maximum frequency.
    -   Find minimum non-zero frequency.
    -   Add (max - min) to total sum.

------------------------------------------------------------------------

# Java Code

``` java
import java.util.*;

class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            Map<Character, Integer> freq = new HashMap<>();

            for (int j = i; j < n; j++) {

                freq.put(s.charAt(j), 
                    freq.getOrDefault(s.charAt(j), 0) + 1);

                int maxi = Integer.MIN_VALUE;
                int mini = Integer.MAX_VALUE;

                for (int val : freq.values()) {
                    mini = Math.min(mini, val);
                    maxi = Math.max(maxi, val);
                }

                sum += (maxi - mini);
            }
        }

        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "xyx";
        System.out.println("Beauty Sum: " + sol.beautySum(s));
    }
}
```

------------------------------------------------------------------------

## Complexity Analysis

Time Complexity: - Outer loop: O(n) - Inner loop: O(n) - Frequency
calculation: O(26) Overall ≈ O(n²)

Space Complexity: - Frequency map stores at most 26 characters → O(1)
