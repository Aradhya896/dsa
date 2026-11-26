class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
      ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
      for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
        }for(int i = 0; i < n; i++) {
    for(int j = 0; j < n; j++) {

        if(isConnected[i][j] == 1 && i != j) {
            adj.get(i).add(j);
        }
    }
}
      int c=0;
      boolean visited[]=new boolean[n];
      for(int i=0;i<n;i++){
       
        if(!visited[i]){
            ArrayList<Integer>comp = new ArrayList<>();
            func(i,visited,adj,comp);
            c++;
        }
      }
    return c;
      
        
    }
    void func(int curr,boolean visited[],ArrayList<ArrayList<Integer>>adj,ArrayList<Integer>comp){
visited[curr]=true;
comp.add(curr);
for(int i:adj.get(curr)){
    if(!visited[i]){
        func(i,visited,adj,comp);
    }
}

    }
}