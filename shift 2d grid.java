class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows=grid.length;
        int cols=grid[0].length;
        int total=rows*cols;
        int[] flat = new int[total];
        int index = 0;
        for (int[] row : grid) {
            for (int val : row) {
                flat[index++] = val;
            }
        }
          int[] shifted = new int[total];
        for (int i = 0; i < total; i++) {
            shifted[(i + k) % total] = flat[i];
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < total; i += cols) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(shifted[i + j]);
            }
            result.add(row);
        }

        return result;
    }
}
