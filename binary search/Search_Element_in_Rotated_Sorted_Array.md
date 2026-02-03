# Search Element in a Rotated Sorted Array

## Problem Statement
Given an integer array `nums` sorted in ascending order with **distinct values**, but rotated at an unknown pivot, and a target value `k`, find the index of `k` in the array.
If the element is not present, return `-1`.

---

## Examples

### Example 1
**Input:**  
nums = [4, 5, 6, 7, 0, 1, 2], k = 0  
**Output:**  
4

### Example 2
**Input:**  
nums = [4, 5, 6, 7, 0, 1, 2], k = 3  
**Output:**  
-1

---

## Brute Force Approach

### Algorithm
- Traverse the array from left to right.
- If the current element matches `k`, return its index.
- If the entire array is scanned and the element is not found, return `-1`.

### Java Code
```java
class Solution {
    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(nums, target));
    }
}
```

### Complexity Analysis
- **Time Complexity:** O(N)
- **Space Complexity:** O(1)

---

## Optimal Approach (Binary Search)

### Algorithm
- Use binary search.
- Find the middle element.
- Check which half is sorted.
- Decide whether the target lies in the sorted half or the unsorted half.
- Eliminate half of the array in each step.

### Java Code
```java
class Solution {
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(nums, target));
    }
}
```

### Complexity Analysis
- **Time Complexity:** O(log N)
- **Space Complexity:** O(1)
