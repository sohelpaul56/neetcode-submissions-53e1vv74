class NumMatrix {
    int[][] prefixsum;

    public NumMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        prefixsum = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
        int top= (i > 0) ? prefixsum[i-1][j] : 0;
        int left= (j > 0) ? prefixsum[i][j-1] : 0;
        int topleft=(i>0 && j>0)?prefixsum[i-1][j-1]:0;
        prefixsum[i][j]=matrix[i][j]+top+left-topleft;
            }
        }
    }
    public int sumRegion(int row1, int col1, int row2, int col2) {
 
     int top = (row1 > 0) ? prefixsum[row1 - 1][col2] : 0;

    int left = (col1 > 0) ? prefixsum[row2][col1 - 1] : 0;

    int topleft = (row1 > 0 && col1 > 0)
                    ? prefixsum[row1 - 1][col1 - 1]
                    : 0;

    return prefixsum[row2][col2]
           - top
           - left
           + topleft;
    }
}