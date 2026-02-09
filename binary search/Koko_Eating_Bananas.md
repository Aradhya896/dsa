
# Koko Eating Bananas

## Problem Statement
A monkey Koko is given `n` piles of bananas, where the `i-th` pile has `a[i]` bananas.
An integer `h` is given representing total hours.

Each hour, Koko eats `k` bananas from one pile.
If a pile has less than `k`, she eats all of them.

Find the **minimum eating speed `k`** so that all bananas are eaten within `h` hours.

---

## Example 1
Input:
```
a = [7, 15, 6, 3], h = 8
```
Output:
```
5
```

## Example 2
Input:
```
a = [25, 12, 8, 14, 19], h = 5
```
Output:
```
25
```

---

## Brute Force Approach

### Algorithm
1. Find the maximum pile.
2. Try every speed from `1` to `maxPile`.
3. For each speed, calculate total hours using ceiling division.
4. First speed with hours ≤ `h` is the answer.

### Java Code
```java
class Solution {
    int calculateTotalHours(int[] a, int k) {
        int hours = 0;
        for (int pile : a) {
            hours += (pile + k - 1) / k;
        }
        return hours;
    }

    public int minEatingSpeed(int[] a, int h) {
        int max = 0;
        for (int x : a) max = Math.max(max, x);

        for (int k = 1; k <= max; k++) {
            if (calculateTotalHours(a, k) <= h)
                return k;
        }
        return max;
    }
}
```

### Complexity
- Time: **O(N × max(a))**
- Space: **O(1)**

---

## Optimal Approach (Binary Search)

### Algorithm
1. Search space = `1` to `maxPile`.
2. Mid represents eating speed.
3. If hours ≤ `h`, try smaller speed.
4. Else increase speed.
5. Final answer is minimum valid speed.

### Java Code
```java
class Solution {
    int hours(int[] piles, int k) {
        int total = 0;
        for (int p : piles) {
            total += (p + k - 1) / k;
        }
        return total;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;
        for (int p : piles) high = Math.max(high, p);

        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (hours(piles, mid) <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
```

### Complexity
- Time: **O(N log max(a))**
- Space: **O(1)**

---
