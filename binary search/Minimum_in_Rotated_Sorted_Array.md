# Minimum in Rotated Sorted Array

## Problem Statement
Given an integer array `arr` of size `N`, sorted in ascending order with **distinct values**, the array is rotated at an unknown index.
Find the **minimum element** in the array.

---

## Examples

### Example 1
**Input:**  
arr = [4, 5, 6, 7, 0, 1, 2, 3]  
**Output:**  
0

### Example 2
**Input:**  
arr = [3, 4, 5, 1, 2]  
**Output:**  
1

---

## Brute Force Approach

### Algorithm
- Traverse the entire array.
- Keep updating the minimum element.
- Return the minimum value found.

### Java Code
```java
class Solution {
    public static int findMin(int[] nums) {
        int minVal = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            minVal = Math.min(minVal, nums[i]);
        }
        return minVal;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMin(nums));
    }
}
```

### Complexity Analysis
- **Time Complexity:** O(N)
- **Space Complexity:** O(1)

---

## Optimal Approach (Binary Search)

### Algorithm
- Use binary search since the array is rotated but partially sorted.
- Compare the middle element with the last element.
- Decide which half contains the minimum.
- Continue until low points to the minimum element.

### Java Code
```java
class Solution {
    public static int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMin(nums));
    }
}
```

### Complexity Analysis
- **Time Complexity:** O(log N)
- **Space Complexity:** O(1)
