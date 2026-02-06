# Search Single Element in a Sorted Array

## Problem Statement
Given a sorted array of N integers where every element appears exactly twice except one element which appears only once, find that single element.

---

## Examples
**Input:** {1,1,2,2,3,3,4,5,5,6,6}  
**Output:** 4  

**Input:** {1,1,3,5,5}  
**Output:** 3  

---

## Brute Force Approach 1

### Algorithm
Traverse the array and compare each element with its neighbors.  
The element that is different from both neighbors is the answer.

### Java Code
```java
class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        if (n == 1) return arr[0];

        for (int i = 0; i < n; i++) {
            if (i == 0 && arr[i] != arr[i + 1]) return arr[i];
            if (i == n - 1 && arr[i] != arr[i - 1]) return arr[i];
            if (i > 0 && i < n - 1 &&
                arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }
}
```

### Complexity
- **Time:** O(N)  
- **Space:** O(1)

---

## Brute Force Approach 2 (XOR)

### Algorithm
XOR all elements. Duplicate elements cancel out and the remaining value is the single element.

### Java Code
```java
class Solution {
    public int singleNonDuplicate(int[] arr) {
        int ans = 0;
        for (int num : arr) {
            ans ^= num;
        }
        return ans;
    }
}
```

### Complexity
- **Time:** O(N)  
- **Space:** O(1)

---

## Optimal Approach (Binary Search)

### Algorithm
Use the index pairing property in a sorted array and apply binary search to locate the single element.

### Java Code
```java
class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;

        if (n == 1) return arr[0];
        if (arr[0] != arr[1]) return arr[0];
        if (arr[n - 1] != arr[n - 2]) return arr[n - 1];

        int low = 1, high = n - 2;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }

            if ((mid % 2 == 0 && arr[mid] == arr[mid + 1]) ||
                (mid % 2 == 1 && arr[mid] == arr[mid - 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
```

### Complexity
- **Time:** O(log N)  
- **Space:** O(1)
