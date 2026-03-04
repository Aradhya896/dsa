# Find the Row with Maximum Number of 1's

## Problem Statement

You are given a non-empty binary matrix `mat` of size `n x m` where each
row is sorted in ascending order (0s first, then 1s).

Return the index of the row with the maximum number of 1s. - If multiple
rows have the same number of 1s → return the smallest index. - If no 1
exists in the matrix → return -1.

------------------------------------------------------------------------

# Brute Force Approach

## Intuition

Traverse every row and count the number of 1s using nested loops. Keep
track of the maximum count and corresponding row index.

## Algorithm

1.  Initialize:
    -   `cnt_max = 0`
    -   `index = -1`
2.  Traverse each row:
    -   Count number of 1s using inner loop.
    -   If count \> cnt_max:
        -   Update cnt_max
        -   Update index
3.  Return index.

## Time Complexity

O(n × m)

## Space Complexity

O(1)

------------------------------------------------------------------------

# Optimal Approach (Using Binary Search)

## Intuition

Since each row is sorted: All 0s appear before 1s.

Instead of counting all elements: - Find first occurrence of 1 using
Binary Search. - Number of 1s = m - firstIndex

## Algorithm

1.  Initialize:
    -   `cnt_max = 0`
    -   `index = -1`
2.  For each row:
    -   Find first index where value \>= 1 using Binary Search.
    -   Compute count_of_ones = m - firstIndex
    -   If count_of_ones \> cnt_max:
        -   Update cnt_max
        -   Update index
3.  Return index.

## Time Complexity

O(n × log m)

## Space Complexity

O(1)
