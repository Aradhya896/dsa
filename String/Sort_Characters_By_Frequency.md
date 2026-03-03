# Sort Characters by Frequency

## Problem Statement

Given a string `s`, return the array of unique characters sorted by
highest to lowest occurring characters.

If two or more characters have the same frequency, arrange them in
alphabetical order.

------------------------------------------------------------------------

## Examples

### Example 1

**Input:**

    s = "tree"

**Output:**

    ['e', 'r', 't']

**Explanation:** e → 2\
r → 1\
t → 1

Since 'r' and 't' have the same frequency, they are sorted
alphabetically.

------------------------------------------------------------------------

### Example 2

**Input:**

    s = "raaaajj"

**Output:**

    ['a', 'j', 'r']

**Explanation:** a → 4\
j → 2\
r → 1

Characters are sorted by decreasing frequency. In case of ties,
alphabetically.

------------------------------------------------------------------------

# Approach

## Algorithm

1.  Create a frequency array of size 26 for lowercase letters.
2.  Count occurrences of each character.
3.  Sort characters:
    -   First by descending frequency.
    -   If frequencies are equal, sort alphabetically.
4.  Collect characters with non-zero frequency.

------------------------------------------------------------------------

# Java Code

``` java
import java.util.*;

class Solution {
    
    public List<Character> frequencySort(String s) {
        Pair[] freq = new Pair[26];
        
        for (int i = 0; i < 26; i++) {
            freq[i] = new Pair(0, (char)(i + 'a'));
        }

        for (char ch : s.toCharArray()) {
            freq[ch - 'a'].freq++;
        }

        Arrays.sort(freq, (p1, p2) -> {
            if (p1.freq != p2.freq) 
                return p2.freq - p1.freq;
            return p1.ch - p2.ch;
        });

        List<Character> result = new ArrayList<>();
        for (Pair p : freq) {
            if (p.freq > 0) 
                result.add(p.ch);
        }

        return result;
    }

    class Pair {
        int freq;
        char ch;
        Pair(int f, char c) {
            this.freq = f;
            this.ch = c;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "tree";
        List<Character> result = sol.frequencySort(s);
        System.out.println(result);
    }
}
```

------------------------------------------------------------------------

## Complexity Analysis

Time Complexity: - Counting frequencies: O(n) - Sorting 26 elements:
O(26 log 26) Overall: O(n)

Space Complexity: - Frequency array: O(26) - Result list: O(26) Overall:
O(1)
