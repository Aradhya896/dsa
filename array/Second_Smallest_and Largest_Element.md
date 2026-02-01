# Find Second Smallest and Second Largest Element in an Array

## Problem Statement
Given an array, find the **second smallest** and **second largest** element in the array.  
Print **-1** if either of them does not exist.

---

## Examples

**Example 1**
```
Input:  [1, 2, 4, 7, 7, 5]
Output:
Second Smallest : 2
Second Largest  : 5
```

**Example 2**
```
Input:  [1]
Output:
Second Smallest : -1
Second Largest  : -1
```

---

## Brute Force Approach

### Approach
1. Sort the array in ascending order.
2. The element at index `1` is the second smallest.
3. The element at index `n-2` is the second largest.

### Java Code
```java
import java.util.*;

class Solution {
    public static void getElements(int[] arr) {
        int n = arr.length;

        if (n < 2) {
            System.out.println("Second Smallest : -1");
            System.out.println("Second Largest  : -1");
            return;
        }

        Arrays.sort(arr);

        System.out.println("Second Smallest : " + arr[1]);
        System.out.println("Second Largest  : " + arr[n - 2]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        getElements(arr);
    }
}
```

---

## Better Approach

### Approach
1. Traverse the array to find the smallest and largest elements.
2. Traverse again to find:
   - Element just greater than the smallest.
   - Element just smaller than the largest.

### Java Code
```java
class Solution {

    public static void getElements(int[] arr) {
        int n = arr.length;

        if (n < 2) {
            System.out.println("Second Smallest : -1");
            System.out.println("Second Largest  : -1");
            return;
        }

        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }

        int secondSmall = Integer.MAX_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > small && arr[i] < secondSmall)
                secondSmall = arr[i];

            if (arr[i] < large && arr[i] > secondLarge)
                secondLarge = arr[i];
        }

        System.out.println("Second Smallest : " + secondSmall);
        System.out.println("Second Largest  : " + secondLarge);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        getElements(arr);
    }
}
```

---

## Optimal Approach

### Approach
1. Maintain variables for smallest, second smallest, largest, and second largest.
2. Update values in a single traversal.

### Java Code
```java
class Solution {

    static int secondSmallest(int[] arr) {
        int small = Integer.MAX_VALUE, secondSmall = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < small) {
                secondSmall = small;
                small = num;
            } else if (num < secondSmall && num != small) {
                secondSmall = num;
            }
        }
        return secondSmall == Integer.MAX_VALUE ? -1 : secondSmall;
    }

    static int secondLargest(int[] arr) {
        int large = Integer.MIN_VALUE, secondLarge = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > large) {
                secondLarge = large;
                large = num;
            } else if (num > secondLarge && num != large) {
                secondLarge = num;
            }
        }
        return secondLarge == Integer.MIN_VALUE ? -1 : secondLarge;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};

        System.out.println("Second Smallest : " + secondSmallest(arr));
        System.out.println("Second Largest  : " + secondLargest(arr));
    }
}
```
