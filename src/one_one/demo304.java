package one_one;
//二维数组前缀和
public class demo304 {
//1 2 3 4
//4 5 6 4
//7 8 9 4
//1 2 3 4
    private int[][] preSum;
    public demo304(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        preSum = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                preSum[i][j] = matrix[i - 1][j - 1] + preSum[i - 1][j] + preSum[i][j - 1] - preSum[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return preSum[row1][col1] + preSum[row2 + 1][col2 + 1] - preSum[row1][col2 + 1] - preSum[row2 + 1][col1];
    }
}
