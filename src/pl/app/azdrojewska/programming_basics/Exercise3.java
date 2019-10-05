package pl.app.azdrojewska.programming_basics;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Last changes by Anna Zdrojewska on 2019-10-05
 *
 * Created for KM-PROGRAMS
 * http://km-programs.pl/
 */

public class Exercise3 {

    //increase elements of array by counted average of even indexes
    private static void increaseArray() {
        double[] array = getArrayFromUser();
        double avg = evenIndexes(array);
        for (int i = 0; i < array.length; i++) {
            array[i] += avg;
        }
        System.out.println("Average of array elements from even indexes: " + avg);
        System.out.println("OUTPUT ARRAY: " + Arrays.toString(array));
    }

    //count average of elements from even indexes
    private static double evenIndexes(double[] array) {
        //sum of array even elements
        double sum = 0;
        //count a number of even indexes
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && i > 0) {
                sum += array[i];
                count++;
            }
        }
        return sum / count;
    }

    //get elements of an array from user
    private static double[] getArrayFromUser() {
        Scanner sc = new Scanner(System.in);
        //size of an array
        double[] array = new double[UsefulFunctions.arraySize()];
        //get elements from user
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter " + i + " element: ");
            array[i] = sc.nextDouble();
        }
        System.out.println("INPUT ARRAY: " + Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        increaseArray();
    }
}
