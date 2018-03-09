class Solution { 
    public int numIslands(char[][] grid) {
		 int count = 0;
	     for(int col = 0; col<grid.length; col++){
	    	 for(int row = 0; row<grid[0].length; row++){
	    		 if(grid[col][row] == '1'){
	    			 count++;
	    			 countIsland(grid, col, row);
	    	}
	      }
	     }
	     return count;
	    }
	 
	 public void countIsland(char[][] grid, int col, int row){
		 if(col < 0 || row < 0 || col >= grid.length || row >= grid[0].length || grid[col][row] != '1') return;
			 grid[col][row] = '0';
			 countIsland(grid, col+1, row);
	         countIsland(grid, col-1, row);
	         countIsland(grid, col, row+1);
	         countIsland(grid, col, row-1);
	 }
}