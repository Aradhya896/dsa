# GCD of Sum of First N Odd and Even Numbers

## Problem Statement
You are given an integer `n`.

Compute:
- `sumOdd` = Sum of the first `n` positive odd numbers
- `sumEven` = Sum of the first `n` positive even numbers

Return:
GCD(sumOdd, sumEven)

---

## Mathematical Observation

Sum of first n odd numbers = n^2

Sum of first n even numbers = n(n + 1)

We compute:
GCD(n^2, n(n + 1))

Taking n common:
= n × GCD(n, n + 1)

Since consecutive numbers are coprime:
GCD(n, n + 1) = 1

Therefore, Final Answer = n

---

## Optimal Java Code

```java
class Solution {
    public int gcdOfOddEvenSums(int n) {
        return n;
    }
}
```

---

Time Complexity: O(1)
Space Complexity: O(1)
