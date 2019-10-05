package pl.app.azdrojewska.programming_basics;

import java.util.Arrays;
import java.util.Random;

/**
 * Last changes by Anna Zdrojewska on 2019-10-05.
 *
 * Created for KM-PROGRAMS
 * http://km-programs.pl/
 */

public class Exercise4 {

    private static final int SIZE = UsefulFunctions.arraySize();

    //generate second array with first value = 0
    //every next element is sum of elements from first array
    //with indexes 0 to i-1
    private static void generateSecondArray() {
        int[] firsArray = generateFirstArray();
        int[] secondArray = new int[SIZE];
        secondArray[0] = 0;
        for (int i = 1; i < SIZE; i++) {
            if (i == 1) {
                secondArray[i] = firsArray[i - 1];
            } else {
                secondArray[i] = secondArray[i - 1] + firsArray[i - 1];
            }
        }
        System.out.println("SECOND ARRAY: " + Arrays.toString(secondArray));
    }

    //generate first array with values <5, 20>
    private static int[] generateFirstArray() {
        int[] array = new int[SIZE];
        Random rnd = new Random();
        for (int i = 0; i < SIZE; i++) {
            array[i] = rnd.nextInt(16) + 5;
        }
        System.out.println("FIRST ARRAY: " + Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        generateSecondArray();
    }
}
