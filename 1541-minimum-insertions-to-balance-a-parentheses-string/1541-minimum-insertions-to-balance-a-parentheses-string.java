
class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int insertions = 0;
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                open++;
                i++;
            } else {
                // Check whether the next character is ')'
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i += 2;
                } else {
                    // Insert one ')' to complete the pair
                    insertions++;
                    i++;
                }

                // Match the closing pair with an opening '('
                if (open > 0) {
                    open--;
                } else {
                    // Insert one '('
                    insertions++;
                }
            }
        }

        insertions += open * 2;

        return insertions;
    }
}