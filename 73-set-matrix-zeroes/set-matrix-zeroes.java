class Solution {
    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int[] row = new int[n];
        int[] col = new int[m];

        // Traverse matrix and set new row and col arr to 1 
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m;j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }


        // Set Values to 0 in orginal matrix by comparing with row and col arr.
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                   
                }
            }
        }
    }
}