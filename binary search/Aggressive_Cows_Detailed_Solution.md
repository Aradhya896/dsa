# Aggressive Cows (Detailed Solution)

## Problem Statement
You are given an array `arr` of size `n` representing stall positions.
You are also given an integer `k` representing the number of aggressive cows.

Assign stalls to `k` cows such that:
- Each cow is placed in a stall.
- The minimum distance between any two cows is maximized.

Return the maximum possible minimum distance.

---

## Example 1

Input:
N = 6, k = 4  
arr = {0,3,4,7,10,9}

Output:
3

Explanation:
Cows placed at positions {0, 3, 7, 10}.  
Minimum distances = 3, 4, 3 → Maximum possible minimum distance = 3.

---

## Example 2

Input:
N = 5, k = 2  
arr = {4,2,1,3,6}

Output:
5

Explanation:
Cows placed at positions {1, 6}.  
Minimum distance = 5.

---

# Brute Force Approach

## Intuition
Try every possible minimum distance from 1 to (max - min).
For each distance, check if cows can be placed.

## Algorithm
1. Sort the stalls array.
2. For each distance from 1 to maxDist:
   - Check using canPlace().
3. Return the largest valid distance.

## Java Code (Brute Force)

```java
import java.util.*;

class Solution {

    public boolean canPlace(int[] stalls, int cows, int d) {
        int count = 1;
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= d) {
                count++;
                lastPos = stalls[i];
            }
            if (count >= cows) return true;
        }
        return false;
    }

    public int aggressiveCows(int[] stalls, int cows) {

        Arrays.sort(stalls);

        int maxDist = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        for (int d = 1; d <= maxDist; d++) {
            if (canPlace(stalls, cows, d)) {
                ans = d;
            }
        }
        return ans;
    }
}
```

## Complexity (Brute Force)

Time: O(N log N) + O(N * (max - min))  
Space: O(1)

---

# Optimal Approach (Binary Search)

## Intuition
Search the answer space using Binary Search.

Search range:
low = 1  
high = max(stalls) - min(stalls)

If mid works → try larger distance  
If mid fails → try smaller distance

---

## Algorithm

1. Sort stalls.
2. Set low = 1, high = maxDist.
3. While low <= high:
   - mid = (low + high) / 2
   - If canPlace(mid) → store answer, low = mid + 1
   - Else → high = mid - 1
4. Return answer.

---

## Java Code (Optimal)

```java
import java.util.*;

class Solution {

    public boolean canPlace(int[] stalls, int cows, int d) {

        int count = 1;
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {

            if (stalls[i] - lastPos >= d) {
                count++;
                lastPos = stalls[i];
            }

            if (count >= cows) return true;
        }
        return false;
    }

    public int aggressiveCows(int[] stalls, int cows) {

        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canPlace(stalls, cows, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
```

## Complexity (Optimal)

Time: O(N log N) + O(N * log(max - min))  
Space: O(1)

---

## Key Concept
This is a classic **Binary Search on Answer** problem.
