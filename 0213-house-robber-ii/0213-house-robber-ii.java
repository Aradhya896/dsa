class Solution {
    int dp[] = new int[101];

    public int rob(int[] nums) {
        int n = nums.length;

        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        Arrays.fill(dp, -1);
        int a = func(nums, 0, n - 2);

        Arrays.fill(dp, -1);
        int b = func(nums, 1, n - 1);

        return Math.max(a, b);
    }

    int func(int[] nums, int i, int n) {
        if (i > n) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int a = nums[i] + func(nums, i + 2, n);
        int b = func(nums, i + 1, n);

        return dp[i] = Math.max(a, b);
    }
}