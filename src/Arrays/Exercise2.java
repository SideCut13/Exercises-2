package Arrays;

/**
 * Created by Anna Zdrojewska on 2017-07-17.
 * Email: anna_zdrojewska@interia.eu
 *
 *
 * Created for KM-PROGRAMS
 * http://km-programs.pl/
 *
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise2 {

    //generate third matrix where elements are sum of first matrix and horizontal reverse
    //of second matrix
    public static void generateThirdMatrix(int[][] matrix, int[][] secondMatrix){
        int[][] thirdMatrix = new int[matrix.length][matrix[0].length];
        //horizontal reverse second array and enter elements to third matrix
        for (int i = 0; i < secondMatrix.length/2; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                int temp = secondMatrix[secondMatrix.length-1-i][j];
                secondMatrix[secondMatrix.length-1-i][j] = secondMatrix[i][j];
                secondMatrix[i][j] = temp;
                thirdMatrix[i][j] = temp;
            }
        }
        //sum third matrix with elements from first matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                thirdMatrix[i][j] += matrix[i][j] ;
            }
        }
        System.out.println("THIRD MATRIX: " + Arrays.deepToString(thirdMatrix));
    }
    //generate second matrix where values are sum of digit in every element of fisrt matrix
    // ex. first array = [23,12,10] --> second matrix = [5,3,1] because 2+3=5, 1+2=3, 1+0=1
    public static void generateSecondMatrix(int[][] matrix){
        int[][] secondMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int temp1 = matrix[i][j] % 10;
                int temp2 = (matrix[i][j] % 100)/10;
                secondMatrix[i][j] = temp1+temp2;
            }
        }
        System.out.println("SECOND MATRIX: " + Arrays.deepToString(secondMatrix));
        generateThirdMatrix(matrix, secondMatrix);
    }
    // taking number of rows (even number and greater than 2) and columns (greater than 4)
    // from user, and draw matrix with values <5, 25>
    public static int[][] generateMatrix(){
        System.out.println("Enter a number of rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        while(!(rows % 2 == 0) && rows>2){
            System.out.println("Error, type number of rows again: ");
            rows = sc.nextInt();
        }
        System.out.println("Enter a number of columns: ");
        int cols = sc.nextInt();
        while(!(cols>4)){
            System.out.println("Error, type number of columns again: ");
            cols = sc.nextInt();
        }
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
