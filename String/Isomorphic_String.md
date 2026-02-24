# Isomorphic Strings

## Problem Statement

Given two strings `s` and `t`, determine if they are isomorphic.

Two strings are isomorphic if characters in `s` can be replaced to get
`t`.

Rules: - All occurrences of a character must map to the same
character. - No two characters may map to the same character. - A
character may map to itself. - Order must be preserved.

------------------------------------------------------------------------

## Example 1

Input:\
s = "paper"\
t = "title"

Output:\
true

Explanation:\
'p' → 't'\
'a' → 'i'\
'e' → 'l'\
'r' → 'e'

Mapping is consistent and one-to-one.

------------------------------------------------------------------------

## Example 2

Input:\
s = "foo"\
t = "bar"

Output:\
false

Explanation:\
'f' → 'b' is valid\
'o' → 'a' for first 'o'\
But second 'o' would need to map to 'r' → conflict\
Mapping is inconsistent.

------------------------------------------------------------------------

# Approach

## Algorithm

1.  Use two arrays of size 256 to track last seen positions.
2.  Traverse both strings simultaneously.
3.  If previously stored positions of characters do not match → return
    false.
4.  Update last seen positions.
5.  If loop completes → return true.

This checks pattern consistency instead of direct character matching.

------------------------------------------------------------------------

## Java Code

``` java
class Solution {

    public boolean isomorphicString(String s, String t) {

        int[] m1 = new int[256];
        int[] m2 = new int[256];

        int n = s.length();

        for (int i = 0; i < n; ++i) {

            if (m1[s.charAt(i)] != m2[t.charAt(i)]) 
                return false;

            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        String s = "paper";
        String t = "title";

        if (solution.isomorphicString(s, t)) {
            System.out.println("Strings are isomorphic.");
        } else {
            System.out.println("Strings are not isomorphic.");
        }
    }
}
```

------------------------------------------------------------------------

## Complexity Analysis

Time Complexity: O(N)\
Single traversal of the strings.

Space Complexity: O(1)\
Fixed-size arrays of length 256.

------------------------------------------------------------------------

## Key Concept

Pattern Matching using Last-Seen Index Tracking
