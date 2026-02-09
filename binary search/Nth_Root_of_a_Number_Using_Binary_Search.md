# Nth Root of a Number using Binary Search

## Problem Statement
Given two numbers **N** and **M**, find the **N-th root of M**.
The N-th root of a number M is a number X such that:

X^N = M

If the N-th root is **not an integer**, return **-1**.

---

## Examples

### Example 1
Input: N = 3, M = 27  
Output: 3  

### Example 2
Input: N = 4, M = 69  
Output: -1  

---

## Brute Force Approach

### Algorithm
1. Loop from 1 to M
2. Compute i^N
3. If equals M → return i
4. If exceeds M → break
5. Else return -1

### Java Code
```java
class Solution {
    public int nthRoot(int n, int m) {
        for (int i = 1; i <= m; i++) {
            long power = (long) Math.pow(i, n);
            if (power == m) return i;
            if (power > m) break;
        }
        return -1;
    }
}
```

---

## Optimal Approach (Binary Search)

### Algorithm
1. low = 1, high = M
2. While low ≤ high
3. mid = (low + high) / 2
4. Compute mid^N manually
5. Compare with M and shrink range

### Java Code
```java
class Solution {
    public int nthRoot(int n, int m) {
        int low = 1, high = m;
        while (low <= high) {
            int mid = (low + high) / 2;
            long val = 1;
            for (int i = 0; i < n; i++) {
                val *= mid;
                if (val > m) break;
            }
            if (val == m) return mid;
            else if (val < m) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
```

---

### Complexity
- Time: O(log M × N)
- Space: O(1)
