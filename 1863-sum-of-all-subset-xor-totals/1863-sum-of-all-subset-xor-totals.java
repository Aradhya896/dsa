class Solution {

    int total = 0;

    public int subsetXORSum(int[] nums) {
        solve(nums, 0, 0);
        return total;
    }

    public void solve(int[] nums, int index, int xor) {

       
        if(index == nums.length) {
            total += xor;
            return;
        }

       
        solve(nums, index + 1, xor ^ nums[index]);

       
        solve(nums, index + 1, xor);
    }
}