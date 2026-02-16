# Check if a Number is an Armstrong Number

## Problem Statement

Given an integer `N`, return **true** if it is an Armstrong number
otherwise return **false**.

An **Armstrong number** is a number that is equal to the sum of its own
digits each raised to the power of the number of digits.

------------------------------------------------------------------------

## Example 1

Input:\
N = 153

Output:\
True

Explanation:\
1³ + 5³ + 3³ = 1 + 125 + 27 = 153

------------------------------------------------------------------------

## Example 2

Input:\
N = 371

Output:\
True

Explanation:\
3³ + 7³ + 1³ = 27 + 343 + 1 = 371

------------------------------------------------------------------------

# Approach

## Algorithm

1.  Calculate the number of digits in the input number and store it in
    `k`.
2.  Initialize a variable `sum = 0`.
3.  Make a copy of the original number.
4.  While `n > 0`:
    -   Extract last digit using `% 10`.
    -   Add `(digit^k)` to `sum`.
    -   Remove last digit using `/ 10`.
5.  After the loop, compare `sum` with original number.
6.  If equal → return true, else return false.

------------------------------------------------------------------------

## Java Code

``` java
public class ArmstrongChecker {

    public static boolean isArmstrong(int num) {
        int k = String.valueOf(num).length(); // Number of digits
        int sum = 0;
        int n = num;

        while (n > 0) {
            int ld = n % 10;              // Last digit
            sum += Math.pow(ld, k);       // Add digit^k
            n /= 10;                      // Remove digit
        }

        return sum == num;
    }

    public static void main(String[] args) {
        int number = 153;

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
```

------------------------------------------------------------------------

## Complexity Analysis

Time Complexity: O(log10 N + 1)\
The complexity depends on the number of digits in `N`.

Space Complexity: O(1)\
Only constant extra space is used.

------------------------------------------------------------------------

## Key Concept

Digit extraction and power calculation
