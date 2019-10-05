package pl.app.azdrojewska.arrays;

/**
 * Created by Anna Zdrojewska on 2017-07-20.
 * Email: anna_zdrojewska@interia.eu
 *
 *
 * Created for KM-PROGRAMS
 * http://km-programs.pl/
 *
 */

import java.util.Arrays;
import java.util.Random;

public class Exercise3 {
    //sum rows and columns with the same index and print index with max value
    public static void sumRowsAndCols(int[][] matrix){
        //array temp - sum rows and cols in matrix
        //ex. matrix -  [1,2,3]
        //              [2,3,4]
        //              [2,3,1]
        //temp = [11,17,14] because sum of row 0 and column 0 is 11, row 1 and column 1 is 17, etc.
        int[] temp = new int[matrix.length];
        //maximum value is (for the beginning) first value (index 0) in temp array
        int max = temp[0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //sum of rows and columns
                temp[i] += (matrix[i][j] + matrix[j][i]);
                //searching for max value
                if (temp[i] > max) {
                    max = temp[i];
                }
            }
        }
        System.out.println("SUM OF THE SAME INDEXES ROWS AND COLUMNS: " + Arrays.toString(temp));
        //set index
        int index = 0;
        //if we have a few the same max values
        for (int i = 0; i < temp.length ; i++) {
            if (temp[i] == max) {
                //print index of row and column where sum of they values is the maximum value
                index = i;
                System.out.println("Largest sum of values in row and column is in index " + index);

            }
        }

    }
    //generate 10x10 matrix with element <10,100>
    public static void generateMatrix(){
        int size = 10;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Random rnd = new Random();
                matrix[i][j] = rnd.nextInt(91)+10;
            }
        }
        System.out.println("MATRIX: " + Arrays.deepToString(matrix));
        sumRowsAndCols(matrix);
    }
    public static void main(String[] args) {
        generateMatrix();
    }
}
