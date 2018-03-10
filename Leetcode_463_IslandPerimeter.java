class Solution {
    int perimeter = 0;
    
    public int islandPerimeter(int[][] grid) {
        for(int col=0; col<grid.length; col++){
            for(int row=0; row<grid[0].length; row++){
                if((grid[col][row])==1){
                    countPerimeter(grid, col, row);
                }
            }     
        }
        return perimeter;
    }
    
     public void countPerimeter(int[][] grid, int col, int row){
            if(row<0 || col<0 || row>=grid[0].length || col>=grid.length || grid[col][row] == 0) {perimeter++; return;}
            else{
                if(grid[col][row] == -1) return;
                grid[col][row] = -1;
                countPerimeter(grid, col+1, row);
                countPerimeter(grid, col-1, row);
                countPerimeter(grid, col, row+1);
                countPerimeter(grid, col, row-1);
            }
        }
}