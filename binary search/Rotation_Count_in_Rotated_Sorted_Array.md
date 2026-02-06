
# Find out how many times the array has been rotated

## Problem Statement
Given an integer array `arr` of size `N`, sorted in ascending order (with distinct values).
The array is rotated between `1` to `N` times (unknown).
Find how many times the array has been rotated.

---

## Example
Input:
arr = [4,5,6,7,0,1,2,3]

Output:
4

---

## Brute Force Approach

### Algorithm
- Traverse the entire array.
- Find the minimum element.
- The index of the minimum element is the number of rotations.

### Java Code
```java
class Solution {
    public int findRotations(int[] arr) {
        int minVal = arr[0];
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
```

### Complexity Analysis
- Time Complexity: O(N)
- Space Complexity: O(1)

---

## Better Approach

### Algorithm
- Traverse array once.
- Find first index where arr[i] > arr[i+1].
- Return i+1.
- If no break found, return 0.

### Java Code
```java
class Solution {
    public int findRotationCount(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i + 1;
            }
        }
        return 0;
    }
}
```

### Complexity Analysis
- Time Complexity: O(N)
- Space Complexity: O(1)

---

## Optimal Approach (Binary Search)

### Algorithm
- Apply binary search to find index of minimum element.
- Compare mid with high.
- Reduce search space by half.
- Index of minimum element is the rotation count.

### Java Code
```java
class Solution {
    public int findRotations(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
```

### Complexity Analysis
- Time Complexity: O(log N)
- Space Complexity: O(1)
