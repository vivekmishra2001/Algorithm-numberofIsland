package numberOfIsland;

/**
 * Given a 2-d grid map of '1's (land) and '0's (water), count the number of islands. An island 
 * is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
 * You may assume all four edges of the grid are all surrounded by water.
 * 11110
   11010
   11000
   00000
   
   AND is 1
 */

/**
 * @author vivemishra
 *
 */
public class numberOfIsland {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[][] island = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };
		int num = numIslands(island);
		System.out.println(num);
	}

	public static int numIslands(char[][] grid) {
		int counter = 0;
		for (int count = 0; count < grid.length; count++) {

			for (int check = 0; check < grid[count].length; check++) {
				if (grid[count][check] == '1') {
					counter++;
					island(grid, count, check);
				}
			}

		}

		return counter;

	}

	private static void island(char[][] grid, int count, int check) {

		if (count < 0 || count > grid.length - 1 || check < 0 || check > grid[count].length - 1) {
			return;
		}
		if (grid[count][check] == '1') {
			grid[count][check] = '0';
			island(grid, count + 1, check);
			island(grid, count - 1, check);
			island(grid, count, check + 1);
			island(grid, count, check - 1);
		} else {
			return;
		}

	}

}
