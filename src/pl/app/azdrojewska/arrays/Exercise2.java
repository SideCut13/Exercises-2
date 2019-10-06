package pl.app.azdrojewska.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Last changes by Anna Zdrojewska on 2019-10-06.
 *
 * Created for KM-PROGRAMS
 * http://km-programs.pl/
 */

public class Exercise2 {

    //generate third matrix where elements are sum of first matrix
    //and horizontal reverse of second matrix
    private static void generateThirdMatrix(int[][] matrix, int[][] secondMatrix) {
        int[][] thirdMatrix = new int[matrix.length][matrix[0].length];
        //horizontal reverse second matrix
        for (int i = 0; i < secondMatrix.length / 2; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                int temp = secondMatrix[i][j];
                secondMatrix[i][j] = secondMatrix[secondMatrix.length - 1 - i][j];
                secondMatrix[secondMatrix.length - 1 - i][j] = temp;
            }
        }
        //sum elements from second matrix with elements from first matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                thirdMatrix[i][j] = matrix[i][j] + secondMatrix[i][j];
            }
        }
        System.out.println("THIRD MATRIX: " + Arrays.deepToString(thirdMatrix));
    }

    //generate second matrix where values are sum of digit in every element of fisrt matrix
    //ex. first array = [23,12,10] --> second matrix = [5,3,1] because 2+3=5, 1+2=3, 1+0=1
    private static void generateSecondMatrix(int[][] matrix) {
        //initialize matrix
        int[][] secondMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                secondMatrix[i][j] = String.valueOf(matrix[i][j])
                        .chars()
                        .map(Character::getNumericValue)
                        .sum();
            }
        }
        System.out.println("SECOND MATRIX: " + Arrays.deepToString(secondMatrix));
        generateThirdMatrix(matrix, secondMatrix);
    }

    // taking number of rows (even number and greater than 2) and columns (greater than 4)
    // from user, and draw matrix elements from range <5, 25>
    private static int[][] generateMatrix() {
        Scanner sc = new Scanner(System.in);
        //initialize rows and cols
        int rows, cols;
        do {

            System.out.println("Enter a number of rows: ");
            rows = sc.nextInt();
        } while (!(rows % 2 == 0) && rows > 2);
        do {
            System.out.println("Enter a number of columns: ");
            cols = sc.nextInt();
        } while (!(cols > 4));

        Random rnd = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(21) + 5;
            }
        }
        System.out.println("FIRST MATRIX: " + Arrays.deepToString(matrix));
        generateSecondMatrix(matrix);
        return matrix;
    }

    public static void main(String[] args) {
        generateMatrix();
    }
}
