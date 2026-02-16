# Remove Outermost Parentheses

## Problem Statement

A valid parentheses string is defined as:

1.  The empty string "".
2.  If A is valid, then "(" + A + ")" is also valid.
3.  If A and B are valid, then A + B is also valid.

A primitive valid parentheses string is a non-empty valid string that
cannot be split into two or more non-empty valid parentheses strings.

Given a valid parentheses string `s`, remove the outermost parentheses
from every primitive component and return the result.

------------------------------------------------------------------------

## Example 1

Input:\
s = "((()))"

Output:\
"(())"

Explanation:\
The string is a single primitive: "((()))".\
Removing outermost parentheses → "(())".

------------------------------------------------------------------------

## Example 2

Input:\
s = "()(()())(())"

Output:\
"(()())()"

Explanation:\
Primitive decomposition:\
"()" + "(()())" + "(())"

After removing outermost parentheses:\
"" + "()()" + "()"

Final result: "(()())()"

------------------------------------------------------------------------

# Approach

## Algorithm / Intuition

1.  Initialize an empty result string.
2.  Maintain a counter `level` to track nesting depth.
3.  Traverse the string:
    -   If character is '(':
        -   If level \> 0 → append '(' to result.
        -   Increment level.
    -   If character is ')':
        -   Decrement level.
        -   If level \> 0 → append ')' to result.
4.  Return the result.

------------------------------------------------------------------------

## Java Code

``` java
class Solution {

    public String removeOuterParentheses(String s) {

        StringBuilder result = new StringBuilder();
        int level = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                if (level > 0) result.append(ch);
                level++;
            } 
            else if (ch == ')') {
                level--;
                if (level > 0) result.append(ch);
            }
        }

        return result.toString();
    }
}

public class Main {
    public static void main(String[] args) {

        String s = "(()())(())";
        Solution sol = new Solution();

        String ans = sol.removeOuterParentheses(s);

        System.out.println("The result is: " + ans);
    }
}
```

------------------------------------------------------------------------

## Complexity Analysis

Time Complexity: O(n)\
Single traversal of the string.

Space Complexity: O(1)\
Only constant extra variables used (excluding output string).

------------------------------------------------------------------------

## Key Concept

Parentheses depth tracking using a counter.
