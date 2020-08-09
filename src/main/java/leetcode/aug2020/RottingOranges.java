package leetcode.aug2020;

/**
 * https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/550/week-2-august-8th-august-14th/3418/
 * <p>
 * Rotting Oranges
 * In a given grid, each cell can have one of three values:
 * <p>
 * the value 0 representing an empty cell;
 * the value 1 representing a fresh orange;
 * the value 2 representing a rotten orange.
 * Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange becomes rotten.
 * <p>
 * Return the minimum number of minutes that must elapse until no cell has a fresh orange.  If this is impossible, return -1 instead.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * <p>
 * Input: [[2,1,1],[1,1,0],[0,1,1]]
 * Output: 4
 * Example 2:
 * <p>
 * Input: [[2,1,1],[0,1,1],[1,0,1]]
 * Output: -1
 * Explanation:  The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
 * Example 3:
 * <p>
 * Input: [[0,2]]
 * Output: 0
 * Explanation:  Since there are already no fresh oranges at minute 0, the answer is just 0.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= grid.length <= 10
 * 1 <= grid[0].length <= 10
 * grid[i][j] is only 0, 1, or 2.
 */

public class RottingOranges {

    public int orangesRotting(int[][] grid) {

        int goodOrange = 0;
        int rottenOrange = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    goodOrange++;
                } else if (grid[i][j] == 2) {
                    rottenOrange++;
                }
            }
        }

        if (goodOrange == 0) {
            return 0;
        }

        if (rottenOrange == 0) {
            return -1;
        }

        int minutes = 0;
        int orangesSpoiled = 0;
        int totalOrangesSpoiled = 0;
        do {
            minutes++;
            orangesSpoiled = getOrangesSpoiled(grid, minutes);
            totalOrangesSpoiled += orangesSpoiled;
        } while (orangesSpoiled != 0);
        return goodOrange == totalOrangesSpoiled ? minutes - 1 : -1;
    }

    private int getOrangesSpoiled(int[][] grid, int minutes) {
        int orangesSpoiled = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] >= 2 && grid[i][j] < 2 + minutes) {
                    if (i > 0 && grid[i - 1][j] == 1) {
                        grid[i - 1][j] = 2 + minutes;
                        orangesSpoiled++;
                    }
                    if (j > 0 && grid[i][j - 1] == 1) {
                        grid[i][j - 1] = 2 + minutes;
                        orangesSpoiled++;
                    }
                    if (i < (grid.length - 1) && grid[i + 1][j] == 1) {
                        grid[i + 1][j] = 2 + minutes;
                        orangesSpoiled++;
                    }
                    if (j < (grid[i].length - 1) && grid[i][j + 1] == 1) {
                        grid[i][j + 1] = 2 + minutes;
                        orangesSpoiled++;
                    }
                }
            }
        }

        return orangesSpoiled;

    }
}
