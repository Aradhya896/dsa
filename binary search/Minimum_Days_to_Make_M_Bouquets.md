
# Minimum Days to Make M Bouquets (Binary Search)

## Problem Statement
You are given **N roses** and an array `arr[]` where `arr[i]` denotes the day on which the `i-th` rose blooms.
You can make a bouquet only using **k adjacent bloomed roses**.

Find the **minimum number of days** required to make **at least m bouquets**.
Return **-1** if it is not possible.

---

## Key Observations
- If `m * k > N`, it is **impossible**.
- Answer lies between **min(arr)** and **max(arr)**.
- Use **Binary Search on Days**.

---

## Optimal Approach (Binary Search)

### Idea
We binary search on the number of days.
For each mid-day, we check if we can form `m` bouquets using bloomed roses up to that day.

---

## Java Code

```java
class Solution {

    private boolean isPossible(int[] arr, int day, int m, int k) {
        int count = 0, bouquets = 0;

        for (int bloom : arr) {
            if (bloom <= day) {
                count++;
                if (count == k) {
                    bouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        return bouquets >= m;
    }

    public int minDays(int[] arr, int m, int k) {
        if ((long)m * k > arr.length) return -1;

        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for (int x : arr) {
            low = Math.min(low, x);
            high = Math.max(high, x);
        }

        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, mid, m, k)) {
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

---

## Complexity Analysis
- **Time Complexity:** `O(N * log(maxDay - minDay))`
- **Space Complexity:** `O(1)`

---

## Example
**Input:**  
`arr = [7,7,7,7,13,11,12,7], m = 2, k = 3`  

**Output:**  
`12`
