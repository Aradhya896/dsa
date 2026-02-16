# Kth Missing Positive Number

## Problem Statement

You are given a strictly increasing array `vec` and a positive integer
`k`. Find the `k`-th positive integer missing from `vec`.

------------------------------------------------------------------------

## Example 1

Input:\
vec = {4,7,9,10}, k = 1

Output:\
1

Explanation:\
Missing numbers are: 1, 2, 3, 5, 6, 8, 11, 12...\
The 1st missing number is 1.

------------------------------------------------------------------------

## Example 2

Input:\
vec = {4,7,9,10}, k = 4

Output:\
5

Explanation:\
The 4th missing number is 5.

------------------------------------------------------------------------

# Brute Force Approach

## Algorithm

1.  Traverse the array.
2.  If `vec[i] <= k`, increment `k`.
3.  Otherwise, break the loop.
4.  Return `k`.

## Java Code (Brute Force)

``` java
import java.util.*;

class MissingKFinder {

    public int missingK(int[] vec, int k) {
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] <= k) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }
}
```

## Complexity

Time Complexity: O(N)\
Space Complexity: O(1)

------------------------------------------------------------------------

# Optimal Approach (Binary Search)

## Key Idea

Number of missing elements before index `mid`:

missing = vec\[mid\] - (mid + 1)

Use Binary Search to find where missing count becomes \>= k.

------------------------------------------------------------------------

## Algorithm

1.  Initialize low = 0, high = n-1.
2.  While low \<= high:
    -   mid = (low + high) / 2
    -   Calculate missing count.
    -   If missing \< k → move right.
    -   Else → move left.
3.  Return k + high + 1.

------------------------------------------------------------------------

## Java Code (Optimal)

``` java
import java.util.*;

class MissingKFinder {

    public int missingK(int[] vec, int k) {

        int low = 0, high = vec.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;
            int missing = vec[mid] - (mid + 1);

            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return k + high + 1;
    }
}
```

## Complexity

Time Complexity: O(log N)\
Space Complexity: O(1)

------------------------------------------------------------------------

## Concept Used

Binary Search on Missing Count
