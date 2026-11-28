class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        return func(n-1,amount,coins);
    }
    int func(int i, int target,int coins[]){
        if(target==0){
            return 0;
        }
        if(i==0){
            if(coins[i]==target) return 1;

        }
        if(i<0){
            return 0;
        }
        int take=0;
        if(coins[i]<=target){
           take=1+func(i,target-coins[i],coins);
        } int notTake=func(i-1,target,coins);
        return take+notTake;
    }
}