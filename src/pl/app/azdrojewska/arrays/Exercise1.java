package pl.app.azdrojewska.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Last changes by Anna Zdrojewska on 2019-10-05.
 *
 * Created for KM-PROGRAMS
 * http://km-programs.pl/
 */

public class Exercise1 {

    //sum of values in each row and each column
    private static void sumRowsAndCols(int[][] matrix) {
        //initializing arrays for rows and cols
        int[] sumRows = new int[matrix.length];
        int[] sumCols = new int[matrix.length];
        //sum elements in each row and each column
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sumRows[i] += matrix[i][j];
                sumCols[i] += matrix[j][i];
            }
        }
        System.out.println("SUM OF COLS: " + Arrays.toString(sumCols));
        System.out.println("SUM OF ROWS: " + Arrays.toString(sumRows));
        //print number of column and row where sum differs by 3 or less
        for (int i = 0; i < matrix.length; i++) {
            if (((sumRows[i] - sumCols[i]) < 3) && ((sumRows[i] - sumCols[i]) > -3))
                System.out.println("In column and row No." + i + " a sum of elements is less than 3");
            else
                System.out.println("Column and row No." + i + " don't have a sum of element less than 3");
        }
    }

    //generate matrix with rows and cols from range <3,10> while !rows==cols
    //matrix elements are draw <4,20>
    private static void generateMatrix() {
        Random rnd = new Random();
        //draw size of rows ald cols
        int rows, cols;
        do {
            rows = rnd.nextInt(8) + 3;
            cols = rnd.nextInt(8) + 3;
        } while (!(rows == cols));

        //initialize matrix
        int[][] matrix = new int[rows][cols];
        //draw elements in matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rnd.nextInt(17) + 4;
            }
        }
        System.out.println("GENERATED MATRIX: ");
        System.out.println(Arrays.deepToString(matrix));
        sumRowsAndCols(matrix);
    }

    public static void main(String[] args) {
        generateMatrix();
    }
}
