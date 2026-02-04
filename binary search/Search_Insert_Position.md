# Search Insert Position

## Problem Statement
You are given a **sorted array of distinct values** `arr` and a **target value** `x`.
You need to return the **index of x if it exists**. Otherwise, return the **index where it should be inserted** so that the array remains sorted.

---

## Examples

### Example 1
**Input:**  
`arr = {1, 2, 4, 7}`, `x = 6`  

**Output:**  
`3`  

**Explanation:**  
6 is not present in the array. If we insert 6 at index 3 (0-based), the array becomes:  
`{1, 2, 4, 6, 7}` which is still sorted.

---

### Example 2
**Input:**  
`arr = {1, 2, 4, 7}`, `x = 2`  

**Output:**  
`1`  

**Explanation:**  
2 is already present in the array at index 1.

---

## Approach (Binary Search)

Since the array is already sorted, we can efficiently solve this problem using **Binary Search**.

### Algorithm
1. Initialize two pointers:
   - `low = 0`
   - `high = n - 1`
2. Initialize `ans = n` (default insertion position if `x` is greater than all elements).
3. While `low <= high`:
   - Compute `mid = (low + high) / 2`
   - If `arr[mid] >= x`:
     - `mid` can be a valid answer → update `ans = mid`
     - Move left: `high = mid - 1`
   - Else:
     - Move right: `low = mid + 1`
4. Return `ans`.

---

## Java Code

```java
import java.util.*;

public class BinarySearchInsert {

    // Function to find the insert position of x in sorted array
    public int searchInsert(int[] arr, int x) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = n; // Default to end if x is greater than all elements

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= x) {
                ans = mid;      // Potential answer
                high = mid - 1; // Search left
            } else {
                low = mid + 1;  // Search right
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7};
        int x = 6;

        BinarySearchInsert obj = new BinarySearchInsert();
        int index = obj.searchInsert(arr, x);

        System.out.println("The index is: " + index);
    }
}
```

---

## Complexity Analysis
- **Time Complexity:** `O(log N)`  
- **Space Complexity:** `O(1)`

---

## Key Takeaways
- This problem is a variation of **Lower Bound**
- Binary Search guarantees optimal performance
- Very common in **coding interviews**
