
# Find the Smallest Divisor Given a Threshold (Binary Search)

## Problem Statement
You are given an array of integers `arr[]` and an integer `limit`.

Find the **smallest positive divisor** such that:
Sum of ⌈arr[i] / divisor⌉ for all i <= limit

Return **-1** if it is not possible.

---

## Key Observations
- Minimum divisor = 1
- Maximum divisor = max(arr)
- As divisor increases → total sum decreases
- This is a **Binary Search on Answer** problem

---

## Optimal Approach (Binary Search)

### Algorithm
1. If `arr.length > limit`, return `-1`.
2. Set `low = 1`, `high = max(arr)`.
3. While `low <= high`:
   - Find `mid`
   - Compute sum of ceil(arr[i] / mid)
   - If sum <= limit → try smaller divisor (`high = mid - 1`)
   - Else → increase divisor (`low = mid + 1`)
4. Return `low`.

---

## Java Code

```java
class Solution {

    private int computeSum(int[] arr, int divisor) {
        int sum = 0;
        for (int num : arr) {
            sum += (num + divisor - 1) / divisor; // ceiling division
        }
        return sum;
    }

    public int smallestDivisor(int[] arr, int limit) {

        if (arr.length > limit) return -1;

        int low = 1;
        int high = 0;

        for (int num : arr) {
            high = Math.max(high, num);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (computeSum(arr, mid) <= limit) {
                high = mid - 1;
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

- **Time Complexity:** O(N * log(max(arr)))
- **Space Complexity:** O(1)

---

## Example

Input:
arr = [1,2,3,4,5], limit = 8

Output:
3
