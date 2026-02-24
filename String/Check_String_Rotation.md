# Check if One String is Rotation of Another

## Problem Statement

Given two strings `s` and `goal`, return **true** if and only if `s` can
become `goal` after some number of shifts on `s`.

A shift on `s` consists of moving the leftmost character of `s` to the
rightmost position.

Example: If `s = "abcde"`, after one shift → `"bcdea"`

------------------------------------------------------------------------

## Examples

### Example 1

**Input:**

    s = "rotation"
    goal = "tionrota"

**Output:**

    true

**Explanation:** After multiple left shifts on "rotation", we get: 1st
shift → "otationr"\
2nd shift → "tationro"\
3rd shift → "ationrot"\
4th shift → "tionrota"

So the goal string can be obtained by rotating the original string.

------------------------------------------------------------------------

### Example 2

**Input:**

    s = "hello"
    goal = "lohelx"

**Output:**

    false

**Explanation:** Even after all possible rotations of "hello", we cannot
form "lohelx" due to the extra character 'x'.

------------------------------------------------------------------------

# Brute Force Approach

## Algorithm

1.  Generate all possible left rotations of the original string.
2.  For each rotated string, compare it with `goal`.
3.  If a match is found, return true.
4.  If no match is found after checking all rotations, return false.

## Java Code

``` java
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (rotated.equals(goal)) {
                return true;
            }
        }

        return false;
    }
}
```

## Complexity Analysis

-   Time Complexity: O(N²)
-   Space Complexity: O(N)

------------------------------------------------------------------------

# Optimal Approach

## Algorithm

1.  Check if lengths of both strings are equal.
2.  Concatenate the string with itself: `s + s`.
3.  Check if `goal` is a substring of `s + s`.
4.  If yes → return true, otherwise false.

## Java Code

``` java
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String doubledS = s + s;
        return doubledS.contains(goal);
    }
}
```

## Complexity Analysis

-   Time Complexity: O(N)
-   Space Complexity: O(N)
