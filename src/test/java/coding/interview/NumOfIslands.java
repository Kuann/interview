package coding.interview;

public class NumOfIslands {

	public int numIslands(char[][] grid) {
		if (grid.length == 0 || grid[0].length == 0) {
			return 0;
		}
		
		int n = grid.length;
		int m = grid[0].length;
		int count = 0;
		boolean[][] visited = new boolean[n][m]; 
		
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				if (grid[i][j] == 1 && visited[i][j] == false) {
					visit(grid, visited, i, j);
					count++;
				}
			}
		}
		
		return count;
	}

	private void visit(char[][] grid, boolean[][] visited, int i, int j) {
		int n = grid.length;
		int m = grid[0].length;
		
		if (i >= 0 && i < n && j >= 0 && j < m && grid[i][j] == 1 && visited[i][j] == false) {
			visited[i][j] = true;
			visit(grid, visited, i + 1, j);
			visit(grid, visited, i, j + 1);
			visit(grid, visited, i - 1, j);
			visit(grid, visited, i, j - 1);
		}
		
	}

	public static void main(String[] args) {
		char[][] grid = new char[][] { 
			{ 1, 1, 0, 1 }, 
			{ 0, 1, 1, 0 }, 
			{ 1, 0, 1, 1 }, 
			{ 1, 0, 1, 1 } 
			};
		System.out.println(new NumOfIslands().numIslands(grid));
	}

}
