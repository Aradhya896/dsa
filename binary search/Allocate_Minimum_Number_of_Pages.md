# Allocate Minimum Number of Pages (Binary Search)

## Problem Statement
Given an array `arr[]` where `arr[i]` represents the number of pages in the i-th book,
and an integer `m` representing number of students.

Allocate books such that:
- Each student gets at least one book.
- Each book is allocated to only one student.
- Allocation is contiguous.
- The maximum pages assigned to a student is minimized.

Return -1 if allocation is not possible.

---

## Key Observations

- If `m > n`, return -1.
- Minimum possible answer = max(arr)
- Maximum possible answer = sum(arr)
- Use Binary Search on Answer.

---

## Optimal Approach (Binary Search)

1. Set:
   - `low = max(arr)`
   - `high = sum(arr)`
2. While `low <= high`:
   - Find `mid`
   - Check if allocation possible with `mid` as maximum pages
   - If possible → try smaller (`high = mid - 1`)
   - Else → increase (`low = mid + 1`)
3. Return `low`

---

## Java Code

```java
import java.util.*;

class Solution {

    public int findPages(int[] arr, int k) {

        if (k > arr.length) return -1;

        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(arr, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    private boolean isPossible(int[] arr, int k, int barrier) {

        int students = 1;
        int pages = 0;

        for (int num : arr) {

            if (num > barrier) return false;

            if (pages + num > barrier) {
                students++;
                pages = num;
            } else {
                pages += num;
            }
        }

        return students <= k;
    }
}
```

---

## Complexity Analysis

Time Complexity: O(N * log(sum - max))  
Space Complexity: O(1)

---

## Example

Input:
arr = [12, 34, 67, 90], m = 2

Output:
113
