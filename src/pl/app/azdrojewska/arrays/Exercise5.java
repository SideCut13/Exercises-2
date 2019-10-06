package pl.app.azdrojewska.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Last changes by Anna Zdrojewska on 2019-10-06.*
 *
 * Created for KM-PROGRAMS
 * http://km-programs.pl/
 */

public class Exercise5 {

    private static void firstGreaterThanAvg(int[][] matrix) {
        //average of each row in matrix
        double[] avg = new double[matrix.length];
        for (int i = 0; i < avg.length; i++) {
            avg[i] = IntStream.of(matrix[i]).average().getAsDouble();
        }
        System.out.println("AVERAGE VALUES IN EACH ROW: " + Arrays.toString(avg));
        //initializing counter
        int counter = 0;
        //count how many first elements in row are greater than average of this row
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (avg[i] < matrix[i][0]) {
                    counter++;
                    //fill row with first element greater than average with 0
                    Arrays.fill(matrix[i], 0);
                }
            }
        }
        System.out.println(counter + " rows have first value greater than average of row");
        System.out.println("RESULT ARRAY: " + Arrays.deepToString(matrix));
    }

    //create irregular matrix - number of rows is the same, irregular is the number of columns
    private static void createIrregularMatrix() {
        Scanner sc = new Scanner(System.in);
        int rows;
        //number of rows from user
        do {
            System.out.print("Please, enter a number of rows: ");
            rows = sc.nextInt();
        } while (rows <= 0);
        Random rand = new Random();
        //initializing matrix
        int[][] matrix = new int[rows][];
        //draw a number of column from range <3, 15> for each row
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[rand.nextInt(13) + 3];
        }
        //filling matrix with values from range <4, 20>
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(17) + 4;
            }
        }
        System.out.println("IRREGULAR MATRIX: " + Arrays.deepToString(matrix));
        firstGreaterThanAvg(matrix);
    }

    public static void main(String[] args) {
        createIrregularMatrix();
    }
}
