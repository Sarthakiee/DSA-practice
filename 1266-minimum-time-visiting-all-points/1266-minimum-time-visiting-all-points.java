class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
    int a = 0;
        for (int i = 0; i < points.length - 1; i++) {
         int cX = points[i][0];
         int cY = points[i][1];
         int tarX = points[i + 1][0];
         int tarY = points[i + 1][1];
          a += Math.max(Math.abs(tarX - cX), Math.abs(tarY - cY));
        }    
    return a;
    }
}