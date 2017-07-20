package Arrays;

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

public class Exercise4 {
    //search for diagonal values of our matrix and count how many times
    //they are the largest element in row
    public static void diagonalValues(int[][] matrix, int[] maxRows){
        int[] diagonal = new int[maxRows.length];
        //counter - if we have diagonal element as a largest element in row
        int counter = 0;
        for (int i = 0; i < matrix.length ; i++) {
            //we have squared matrix so our diagonal element is always where
            //index of row and column have the same value - that's why matrix[i][i]
            diagonal[i] = matrix[i][i];
            if(diagonal[i] == maxRows[i]) {
                //diagonal element is the largest one so we increment a counter
                counter++;
            }
        }
        System.out.println("DIAGONAL VALUES: " + Arrays.toString(diagonal));
        System.out.println("In our matrix, " + counter + " diagonal elements are the largest elements in rows");

    }
    //search for maximum value in each row
    public static int[] maxValRow(int[][] matrix){
        //array where we have our max values
        int[] maxRows = new int[matrix.length];
        for (int i = 0; i < maxRows.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //maximum value
                if (matrix[i][j] > maxRows[i]){
                    maxRows[i] = matrix[i][j];

                }
            }
        }
        System.out.println("MAX VALUES IN EACH ROW: " + Arrays.toString(maxRows));
        return maxRows;
    }
    //generate 10x10 matrix with element <45,230>
    public static void generateMatrix(){
        int size = 10;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Random rnd = new Random();
                matrix[i][j] = rnd.nextInt(186)+45;
            }
        }
        System.out.println("MATRIX: " + Arrays.deepToString(matrix));

        diagonalValues(matrix, maxValRow(matrix));
    }
    public static void main(String[] args) {
        generateMatrix();

    }
}
