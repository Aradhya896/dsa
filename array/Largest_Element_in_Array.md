# Largest Element in an Array

## Problem Statement
Given an array of integers, find the **largest element** present in the array.

---

## Examples

**Example 1:**
```
Input:  arr[] = {2, 5, 1, 3, 0}
Output: 5
```

**Example 2:**
```
Input:  arr[] = {8, 10, 5, 7, 9}
Output: 10
```

---

## Brute Force Approach

### Approach
1. Sort the array in ascending order.
2. The last element of the sorted array will be the largest element.

### Java Code
```java
import java.util.*;

class LargestElementBruteForce {
    static int findLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 5, 1, 3, 0};
        int[] arr2 = {8, 10, 5, 7, 9};

        System.out.println(findLargest(arr1));
        System.out.println(findLargest(arr2));
    }
}
```

---

## Better / Optimal Approach

### Approach
1. Assume the first element is the largest.
2. Traverse the array from the second element.
3. Compare each element with the current largest value.
4. Update the largest value whenever a bigger element is found.

### Java Code
```java
class LargestElementOptimal {
    static int findLargest(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 5, 1, 3, 0};
        int[] arr2 = {8, 10, 5, 7, 9};

        System.out.println(findLargest(arr1));
        System.out.println(findLargest(arr2));
    }
}
```
