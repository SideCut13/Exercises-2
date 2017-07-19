package Arrays;

/**
 * Created by Anna Zdrojewska on 2017-07-18.
 * Email: anna_zdrojewska@interia.eu
 *
 *
 * Created for KM-PROGRAMS
 * http://km-programs.pl/
 *
 */

import java.util.Arrays;
import java.util.Random;


public class Exercise1 {
    //sum of values in each row and each column
    public static void sumRowsAndCols(int[][] matrix){
        int[] sumR = new int[matrix.length];
        int[] sumC = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sumR[i] += matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sumC[i] += matrix[j][i];
            }
        }
        //print number of colmun and row where sum differs by 3 or less
        for (int i = 0; i < matrix.length; i++) {
            if(((sumR[i] - sumC[i]) < 3 )&&((sumR[i] - sumC[i]) > -3)){
                System.out.println("Column and row " + i + " have sum of element values less than 3");
            }
        }

    }

    //generate matrix with rows and cols (<3,10>) while rows==cols
    //matrix elements are draw <4,20>
    public static int[][] generateMatrix(int[][] matrix){
        Random rnd = new Random();
        int rows = rnd.nextInt(8) + 3;
        int cols = rnd.nextInt(8) + 3;
        while(!(rows==cols)){
            rows = rnd.nextInt(8) + 3;
            cols = rnd.nextInt(8) + 3;
        }
        matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rnd.nextInt(17) + 4;
            }
        }
        sumRowsAndCols(matrix);
        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix = new int[][]{};
        System.out.println(Arrays.deepToString(generateMatrix(matrix)));
    }
}
