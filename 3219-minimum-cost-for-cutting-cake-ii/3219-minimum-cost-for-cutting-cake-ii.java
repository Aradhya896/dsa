class Solution {
    public long minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);
        int h=m-2;
        int v=n-2;
        int hp=1;
        int vp=1;
        long cost=0;
        while(h>=0 && v>=0){
            if(horizontalCut[h]>=verticalCut[v]){
                cost+=(horizontalCut[h]*vp);
                h--;
                hp++;
        }   else{ 
                cost+=(verticalCut[v]*hp);
                v--;
                vp++;
            }
        }
        while(h>=0){
            cost+=(horizontalCut[h]*vp);
                h--;
                hp++;
        }while(v>=0){
             cost+=(verticalCut[v]*hp);
                v--;
                vp++;
        }
        return cost;

    }
}