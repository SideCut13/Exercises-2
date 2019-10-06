package pl.app.azdrojewska.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Last changes by Anna Zdrojewska on 2019-10-06.
 *
 * Created for KM-PROGRAMS
 * http://km-programs.pl/
 */

public class Exercise3 {

    //sum rows and columns with the same index and print index with max value
    private static void sumRowsAndCols(int[][] matrix) {
        //array - sum rows and cols in matrix
        //ex. matrix -  [1,2,3]
        //              [2,3,4]
        //              [2,3,1]
        //array = [11,17,14] because sum of row 0 and column 0 is 11, row 1 and column 1 is 17, etc.
        int[] array = new int[matrix.length];
        //maximum value is (for the beginning) 0
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //sum of rows and columns
                array[i] += (matrix[i][j] + matrix[j][i]);
                //searching for max value
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }
        System.out.println("SUM OF THE SAME INDEXES ROWS AND COLUMNS: " + Arrays.toString(array));

        //if we have a few the same max values
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                //print index of row and column where sum of they values is the maximum value
                System.out.println("Largest sum of values in row and column is in index " + i);
            }
        }
    }

    //generate 10x10 matrix with element from range <10,100>
    private static void generateMatrix() {
        int size = 10;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Random rnd = new Random();
                matrix[i][j] = rnd.nextInt(91) + 10;
            }
        }
        System.out.println("GENERATED MATRIX: " + Arrays.deepToString(matrix));
        sumRowsAndCols(matrix);
    }

    public static void main(String[] args) {
        generateMatrix();
    }
}
