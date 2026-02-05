# Spiral Traversal of Matrix

## Problem Statement
Given a Matrix, print the given matrix in spiral order.

---

## Examples

### Example 1
**Input:**
```
Matrix[][] = {
 {1, 2, 3, 4},
 {5, 6, 7, 8},
 {9, 10, 11, 12},
 {13, 14, 15, 16}
}
```
**Output:**  
```
1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10
```

### Example 2
**Input:**
```
Matrix[][] = {
 {1, 2, 3},
 {4, 5, 6},
 {7, 8, 9}
}
```
**Output:**  
```
1, 2, 3, 6, 9, 8, 7, 4, 5
```

---

## Approach

### Algorithm
- Maintain four boundaries: `top`, `bottom`, `left`, `right`
- Traverse:
  - Top row (left → right)
  - Right column (top → bottom)
  - Bottom row (right → left)
  - Left column (bottom → top)
- After each traversal, shrink the boundaries
- Continue until all elements are visited

---

## Java Code

```java
import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}

class Main {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println(obj.spiralOrder(matrix));
    }
}
```

---

## Complexity Analysis
- **Time Complexity:** `O(m × n)`
- **Space Complexity:** `O(1)` (excluding output list)
