package three_one;

import java.util.HashSet;

//不同的岛屿数量
public class demo694 {
    public int numDistinctIslands(int[][] grid) {
        HashSet<String> inland = new HashSet<>();
        int m = grid.length;int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                StringBuilder sb = new StringBuilder();
                dfs(i,j,grid,sb,0);
                inland.add(sb.toString());
            }
        }
        return inland.size();
}

    private void dfs(int i, int j, int[][] grid, StringBuilder sb, int dir) {
        int m = grid.length;int n = grid[0].length;
        if(i<0||j<0||i>=m||j>=n)return;
        if(grid[i][j]==0)return;
        grid[i][j] = 0;
        sb.append(dir).append(",");
        dfs(i-1,j,grid,sb,1);
        dfs(i+1,j,grid,sb,2);
        dfs(i,j-1,grid,sb,3);
        dfs(i,j+1,grid,sb,4);
        sb.append(-dir).append(",");
    }
}

