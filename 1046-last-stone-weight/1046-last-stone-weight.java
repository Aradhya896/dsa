class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int n=stones.length;
        for(int i=0;i<n;i++){
            pq.add(stones[i]);
        }
       while(pq.size()>1){
        int y=pq.poll();
        int x=pq.poll();
        if(x!=y){
            pq.add(y-x);
        }
       }
       //return pq.peek();
       return pq.isEmpty() ? 0 : pq.peek();
      
       /*while(n>1){
        Arrays.sort(stones);
        int x=stones[n-2];
        int y=stones[n-1];
        n=n-2;
        if(x!=y){
            stones[n]=y-x;
            n++;
        }

        }
        if(n==0){
            return 0;
    }
    return stones[0];*/
    }
} 
    