
# Capacity to Ship Packages Within D Days (Binary Search)

## Problem Statement
You are given an array `weights[]` representing package weights.
Packages must be shipped in the same order within `d` days.

Find the **minimum ship capacity** so that all packages can be shipped within `d` days.

---

## Key Observations
- Minimum capacity = max(weights)
- Maximum capacity = sum(weights)
- As capacity increases → days required decreases
- This is a **Binary Search on Answer** problem

---

## Optimal Approach (Binary Search)

### Algorithm
1. Set:
   - `low = max(weights)`
   - `high = sum(weights)`
2. While `low < high`:
   - Find `mid`
   - Calculate days needed with capacity = `mid`
   - If days ≤ d → try smaller capacity (`high = mid`)
   - Else → increase capacity (`low = mid + 1`)
3. Return `low`

---

## Java Code

```java
class Solution {

    private int daysNeeded(int[] weights, int capacity) {
        int days = 1;
        int currentLoad = 0;

        for (int w : weights) {
            if (currentLoad + w > capacity) {
                days++;
                currentLoad = w;
            } else {
                currentLoad += w;
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int d) {

        int low = 0, high = 0;

        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (daysNeeded(weights, mid) <= d) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
```

---

## Complexity Analysis

- **Time Complexity:** O(N * log(sum(weights)))
- **Space Complexity:** O(1)

---

## Example

Input:
weights = [5,4,5,2,3,4,5,6], d = 5

Output:
9
