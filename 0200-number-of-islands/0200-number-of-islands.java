class Solution {
    public int numIslands(char[][] grid) {
       int m=grid.length;
       int n=grid[0].length;
       int c=0;
       int visited[][]=new int[m][n];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
           if(visited[i][j]==0 && grid[i][j]=='1'){
            dfs(i,j,visited,grid);
            c++;
           } 
        }}
        return c;
    }

    void dfs(int i,int j,int visited[][],char grid[][]){
        int m=grid.length;
        int n=grid[0].length;

       
if(i<0 || j<0 || i>=m || j>=n || visited[i][j]==1 || grid[i][j]=='0'){
    return;
}
         visited[i][j]=1;
                    dfs(i-1,j,visited,grid);
                    dfs(i,j-1,visited,grid);
                    dfs(i+1,j,visited,grid);
                    dfs(i,j+1,visited,grid);

            
        
    }
}