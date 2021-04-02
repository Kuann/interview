package coding.interview;

public class MaxAreaOfIsland {
	public int numIslands(char[][] grid) {
		if (grid.length == 0 || grid[0].length == 0) {
			return 0;
		}
		
		int n = grid.length;
		int m = grid[0].length;
		int max = 0;
		boolean[][] visited = new boolean[n][m]; 
		
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				if (grid[i][j] == 1 && visited[i][j] == false) {
					int size = visit(grid, visited, i, j);
					if (size > max) {
						max = size;
					}
				}
			}
		}
		
		return max;
	}

	private int visit(char[][] grid, boolean[][] visited, int i, int j) {
		int n = grid.length;
		int m = grid[0].length;
		
		if (i >= 0 && i < n && j >= 0 && j < m && grid[i][j] == 1 && visited[i][j] == false) {
			visited[i][j] = true;
			return 1 + visit(grid, visited, i + 1, j) +
			visit(grid, visited, i, j + 1) +
			visit(grid, visited, i - 1, j) +
			visit(grid, visited, i, j - 1);
		}
		
		return 0;
	}

	public static void main(String[] args) {
		char[][] grid = new char[][] { 
			{ 1, 1, 0, 1 }, 
			{ 0, 1, 0, 0 }, 
			{ 1, 0, 1, 1 }, 
			{ 1, 0, 1, 1 } 
			};
		System.out.println(new MaxAreaOfIsland().numIslands(grid));
	}
}
