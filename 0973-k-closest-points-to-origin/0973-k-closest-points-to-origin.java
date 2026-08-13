class Solution {
    public int[][] kClosest(int[][] points, int k) {
       PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            int distA=points[a][0]*points[a][0]+ points[a][1]*points[a][1];
        int distB=points[b][0]*points[b][0]+points[b][1]*points[b][1];
        return distA-distB;
        });
        for(int i=0;i<points.length;i++){
           // for(int y=0;y<points[1].length;y++){
              pq.add(i);
            }
            int[][]ans=new int[k][2];

            for(int i=0;i<k;i++){
                int idx=pq.poll();
                ans[i]=points[idx];
                
            }return ans;
        
    }
}