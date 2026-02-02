# Implement Lower Bound

## Problem Statement
Given a **sorted array** of N integers and an integer **x**, find the **lower bound** of x.

The **lower bound** is the smallest index `ind` such that:
```
arr[ind] >= x
```
If no such index exists, return `n` (size of the array).

---

## Examples

**Example 1**
```
Input:  N = 4, arr = [1, 2, 2, 3], x = 2
Output: 1
```

**Example 2**
```
Input:  N = 5, arr = [3, 5, 8, 15, 19], x = 9
Output: 3
```

---

## Brute Force Approach

### Approach
1. Traverse the array from the first index.
2. Return the first index where `arr[i] >= x`.
3. If no such index exists, return `n`.

### Java Code
```java
class LowerBoundBruteForce {
    static int lowerBound(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= x)
                return i;
        }
        return arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int x = 9;
        System.out.println(lowerBound(arr, x));
    }
}
```

### Complexity Analysis
- Time Complexity: O(N)
- Space Complexity: O(1)

---

## Optimal Approach (Binary Search)

### Approach
1. Initialize `low = 0`, `high = n - 1`, and `ans = n`.
2. Find `mid`.
3. If `arr[mid] >= x`, update `ans = mid` and move left.
4. Else move right.
5. Return `ans`.

### Java Code
```java
class LowerBoundBinarySearch {
    static int lowerBound(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int x = 9;
        System.out.println(lowerBound(arr, x));
    }
}
```

### Complexity Analysis
- Time Complexity: O(log N)
- Space Complexity: O(1)

---
