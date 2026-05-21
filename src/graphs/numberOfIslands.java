package graphs;//DFS (Depth First Search) on Grid

public class numberOfIslands {//O(m × n) , O(m × n)   (Worst case recursion stack)


	 // Function to count islands
    public static int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0)
            return 0;

        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;

        // Traverse the entire grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == '1') {
                    islands++;               // found one island
                    dfs(grid, i, j);         // mark full island
                }
            }
        }
        return islands;
    }

    // DFS to mark connected land
    private static void dfs(char[][] grid, int row, int col) {

        // Boundary + water check
        if (row < 0 || col < 0 ||
            row >= grid.length || col >= grid[0].length ||
            grid[row][col] == '0') {
            return;
        }

        // Mark current land as visited
        grid[row][col] = '0';

        // Explore all 4 directions
        dfs(grid, row - 1, col); // up
        dfs(grid, row + 1, col); // down
        dfs(grid, row, col - 1); // left
        dfs(grid, row, col + 1); // right
    }

    // Main method for Eclipse execution
    public static void main(String[] args) {

        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };

        int result = numIslands(grid);
        System.out.println("Number of Islands: " + result);
    }
}
