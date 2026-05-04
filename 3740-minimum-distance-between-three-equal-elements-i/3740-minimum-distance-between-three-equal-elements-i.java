class Solution {
    public int minimumDistance(int[] nums) {
     
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[i] == nums[j] && nums[j] == nums[k]) {
                        int dist = 2 * (k - i); 
                        res = Math.min(res, dist);
                    }
                }
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}