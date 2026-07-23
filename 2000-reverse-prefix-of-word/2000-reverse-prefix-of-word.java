class Solution {
    public String reversePrefix(String word, char ch) {
       StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            sb.append(word.charAt(i));

            if (word.charAt(i) == ch) {
                String remaining = word.substring(i + 1);
                sb.reverse();
                return sb.toString() + remaining;
            }
        }

        return word;
    }
}
