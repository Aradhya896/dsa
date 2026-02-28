# Maximum Nesting Depth of Parentheses

## Problem Statement

Given a valid parentheses string `s`, return the nesting depth of `s`.

The nesting depth is the maximum number of nested parentheses.

------------------------------------------------------------------------

## Examples

### Example 1

**Input:**

    s = "(1+(2*3)+((8)/4))+1"

**Output:**

    3

**Explanation:** Digit 8 is inside 3 nested parentheses in the string.

------------------------------------------------------------------------

### Example 2

**Input:**

    s = "(1)+((2))+(((3)))"

**Output:**

    3

**Explanation:** Digit 3 is inside 3 nested parentheses in the string.

------------------------------------------------------------------------

# Approach

## Algorithm

1.  Initialize two variables:
    -   `p` to track current depth.
    -   `ans` to track maximum depth.
2.  Traverse each character in the string:
    -   If '(' → increment `p`.
    -   If ')' → decrement `p`.
    -   Update `ans = max(ans, p)` at each step.
3.  Return `ans` as the maximum nesting depth.

------------------------------------------------------------------------

# Java Code

``` java
class Solution {
    public int maxDepth(String s) {
        int p = 0; 
        int ans = 0; 

        for (char ch : s.toCharArray()) {
            if (ch == '(') 
                p++;
            else if (ch == ')') 
                p--;

            ans = Math.max(ans, p);
        }

        return ans; 
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "(1+(2*3)+((8)/4))+1";
        int result = sol.maxDepth(s);
        System.out.println("Max Depth: " + result);
    }
}
```

------------------------------------------------------------------------

## Complexity Analysis

-   Time Complexity: O(n)
-   Space Complexity: O(1)
