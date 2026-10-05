class Solution {
    int n;
    int[][] dp= new int[1001][1001];

    boolean predecessor(String prev, String curr) {
        int M = prev.length();
        int N = curr.length();

        if (M >= N || N - M != 1)
            return false;

        int i = 0, j = 0;
        while (i < M && j < N) {
            if (prev.charAt(i) == curr.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == M;
    }

    int lis(String[] words, int prevIdx, int currIdx) {
        if (currIdx == n)
            return 0;

        if (prevIdx != -1 && dp[prevIdx][currIdx] != -1)
            return dp[prevIdx][currIdx];

        int taken = 0;
        if (prevIdx == -1 || predecessor(words[prevIdx], words[currIdx]))
            taken = 1 + lis(words, currIdx, currIdx + 1);

        int notTaken = lis(words, prevIdx, currIdx + 1);

        if (prevIdx != -1)
            dp[prevIdx][currIdx] = Math.max(taken, notTaken);

        return Math.max(taken, notTaken);
    }

    int longestStrChain(String[] words) {
        for(int i = 0; i < 1000; i++) {
            for(int j = 0; j < 1000; j++) {
                dp[i][j] = -1;
            }
        }
        
        n = words.length;
        Arrays.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        return lis(words, -1, 0);
    }
}