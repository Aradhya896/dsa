# Binary Search

## Problem Statement
Given a **sorted array** of integers and a target value, find the index of the target element using **Binary Search**.  
If the element is not present, return **-1**.

---

## Examples

**Example 1**
```
Input:  arr = [1, 3, 5, 7, 9], target = 5
Output: 2
```

**Example 2**
```
Input:  arr = [2, 4, 6, 8, 10], target = 7
Output: -1
```

---

## Brute Force Approach (Linear Search)

### Approach
1. Traverse the array from start to end.
2. Compare each element with the target.
3. If found, return the index.
4. If not found, return -1.

### Java Code
```java
class LinearSearch {
    static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 5;
        System.out.println(search(arr, target));
    }
}
```

### Complexity Analysis
- Time Complexity: O(N)
- Space Complexity: O(1)

---

## Optimal Approach (Binary Search – Iterative)

### Approach
1. Initialize low = 0 and high = n - 1.
2. Find the middle index.
3. If middle equals target, return index.
4. If target is smaller, search left half.
5. If target is larger, search right half.

### Java Code
```java
class BinarySearchIterative {
    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 5;
        System.out.println(binarySearch(arr, target));
    }
}
```

### Complexity Analysis
- Time Complexity: O(log N)
- Space Complexity: O(1)

---

## Optimal Approach (Binary Search – Recursive)

### Java Code
```java
class BinarySearchRecursive {
    static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == target)
            return mid;
        else if (arr[mid] < target)
            return binarySearch(arr, mid + 1, high, target);
        else
            return binarySearch(arr, low, mid - 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 5;
        System.out.println(binarySearch(arr, 0, arr.length - 1, target));
    }
}
```

### Complexity Analysis
- Time Complexity: O(log N)
- Space Complexity: O(log N)

---
