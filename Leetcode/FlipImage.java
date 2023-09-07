package Leetcode;

import java.util.Arrays;

class FlipImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image ){
            for (int i = 0; i < (image[0].length + 1) /2  ; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length -i -1]^ 1;
                row[image[0].length -i -1] = temp;
            }

        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] mat = flipAndInvertImage(image);
        for (int i = 0; i < mat.length; i++)

            // Loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
    }

}
