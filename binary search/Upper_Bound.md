# Implement Upper Bound

## Problem Statement
Given a sorted array of N integers and an integer x, find the **upper bound** of x.

**Upper Bound:** The smallest index `ind` such that `arr[ind] > x`.
If no such index exists, return `N` (size of the array).

---

## Examples
**Example 1**
- Input: N = 4, arr = {1, 2, 2, 3}, x = 2
- Output: 3

**Example 2**
- Input: N = 6, arr = {3, 5, 8, 9, 15, 19}, x = 9
- Output: 4

---

## Brute Force Approach
**Approach:** Traverse the array from left to right and return the first index where `arr[i] > x`.

### Java Code
```java
class UpperBoundBrute {
    public static int upperBound(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) return i;
        }
        return arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19};
        int x = 9;
        System.out.println(upperBound(arr, x));
    }
}
```

**Time Complexity:** O(N)  
**Space Complexity:** O(1)

---

## Optimal Approach (Binary Search)
**Approach:** Use binary search to find the smallest index where `arr[mid] > x`.

### Java Code
```java
class UpperBoundOptimal {
    public static int upperBound(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19};
        int x = 9;
        System.out.println(upperBound(arr, x));
    }
}
```

**Time Complexity:** O(log N)  
**Space Complexity:** O(1)
