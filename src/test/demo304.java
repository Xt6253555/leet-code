package test;

public class demo304 {
    int[][]arr;
    public demo304(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        arr = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = matrix[i-1][j-1]+arr[i-1][j]+arr[i][j-1]-arr[i-1][j-1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return arr[row1][col1]+arr[row2+1][col2+1]-arr[row1][col2+1]-arr[row2+1][col1];
    }
}
