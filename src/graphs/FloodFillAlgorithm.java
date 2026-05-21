package graphs;//DFS (Depth First Search) on Grid

public class FloodFillAlgorithm {//O(m × n) , O(m × n)


	 // Flood fill function
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int originalColor = image[sr][sc];

        // If same color, no need to process
        if (originalColor == newColor) {
            return image;
        }

        dfs(image, sr, sc, originalColor, newColor);
        return image;
    }

    // DFS helper
    private static void dfs(int[][] image, int row, int col,
                            int originalColor, int newColor) {

        // Boundary check + color check
        if (row < 0 || col < 0 ||
            row >= image.length || col >= image[0].length ||
            image[row][col] != originalColor) {
            return;
        }

        // Fill current cell
        image[row][col] = newColor;

        // Visit all 4 directions
        dfs(image, row - 1, col, originalColor, newColor); // up
        dfs(image, row + 1, col, originalColor, newColor); // down
        dfs(image, row, col - 1, originalColor, newColor); // left
        dfs(image, row, col + 1, originalColor, newColor); // right
    }

    // Main method for Eclipse execution
    public static void main(String[] args) {

        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };

        int sr = 1, sc = 1;
        int newColor = 2;

        int[][] result = floodFill(image, sr, sc, newColor);

        System.out.println("Flood Filled Image:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
