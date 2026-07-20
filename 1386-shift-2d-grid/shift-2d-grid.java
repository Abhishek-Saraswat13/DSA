class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        while (k-- > 0) {
            int[][] temp = new int[m][n];
            temp[0][0] = grid[m - 1][n - 1];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    if (i == m - 1 && j == n - 1)
                        continue;

                    if (j == n - 1)
                        temp[i + 1][0] = grid[i][j];
                    else
                        temp[i][j + 1] = grid[i][j];
                }
            }

            grid = temp;
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(grid[i][j]);
            }
            ans.add(row);
        }

        return ans;
    }
}