# Longest Common Prefix

## Problem Statement

Write a function to find the longest common prefix string amongst an
array of strings.\
If there is no common prefix, return an empty string "".

------------------------------------------------------------------------

## Example 1

Input:\
str = \["flower", "flow", "flight"\]

Output:\
"fl"

Explanation:\
All strings begin with the common prefix "fl".

------------------------------------------------------------------------

## Example 2

Input:\
str = \["apple", "banana", "grape", "mango"\]

Output:\
""

Explanation:\
No strings share a common starting sequence.

------------------------------------------------------------------------

# Approach

## Algorithm

1.  Sort the array lexicographically.
2.  The common prefix must exist between the first and last strings
    after sorting.
3.  Compare characters of first and last string one by one.
4.  Stop when characters mismatch.
5.  The matched portion is the longest common prefix.

------------------------------------------------------------------------

## Java Code

``` java
import java.util.Arrays;

class Solution {

    public String longestCommonPrefix(String[] v) {

        StringBuilder ans = new StringBuilder();

        Arrays.sort(v);

        String first = v[0];
        String last = v[v.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {

            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }

            ans.append(first.charAt(i));
        }

        return ans.toString();
    }
}

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] input = {"interview", "internet", "internal", "interval"};

        String result = solution.longestCommonPrefix(input);

        System.out.println("Longest Common Prefix: " + result);
    }
}
```

------------------------------------------------------------------------

## Complexity Analysis

Time Complexity: O(N log N + M)\
- Sorting takes O(N log N)\
- Character comparison takes O(M)

Space Complexity: O(M)\
- Result string may store up to M characters.

------------------------------------------------------------------------

## Key Concept

Sorting + Boundary String Comparison
