class Solution {
    int count = 0;
    int global = 0;
    
    public int maxAreaOfIsland(int[][] grid) {
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j] == 1) {
                    countIsland(grid, i, j);
                    global = Math.max(count, global);
                    count = 0;
                }     
            }
        }
       return global;  
    }
    
    public void countIsland(int[][] grid, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == 0) return;
        count++;
        grid[i][j] = 0;
        countIsland(grid, i+1, j);
        countIsland(grid, i-1, j);
        countIsland(grid, i, j+1);
        countIsland(grid, i, j-1);
    }
}