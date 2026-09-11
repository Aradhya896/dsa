class Solution {
    int dp[]=new int[400];
    public int mincostTickets(int[] days, int[] costs) {
        Arrays.fill(dp,-1);
        return func(0,days,costs);
    }
    int func(int i,int days[],int costs[]){
        if(i>=days.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int curr=days[i];
         int id1=days.length;
         int id2=days.length;
        int one_day_ticket=costs[0]+func(i+1,days,costs);
        for(int j=i+1;j<days.length;j++){
            if(days[j]>=curr+7){
                id1=j;
                break;
            }
        }
        for(int j=i+1;j<days.length;j++){
            if(days[j]>=curr+30){
                id2=j;
                break;
            }
        }
        int seven_day_ticket=costs[1]+func(id1,days,costs);
        int thirty_day_ticket=costs[2]+func(id2,days,costs);
        dp[i]= Math.min(one_day_ticket,Math.min(seven_day_ticket,thirty_day_ticket));
        return dp[i];
    }
}