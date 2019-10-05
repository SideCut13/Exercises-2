package pl.app.azdrojewska.programming_basics;

import java.util.Arrays;
import java.util.Random;

/**
 * Last changes by Anna Zdrojewska on 2019-10-05
 *
 * Created for KM-PROGRAMS
 * http://km-programs.pl/
 */

public class Exercise1 {

    //generate an array with elements <4, 10>
    private static int[] drawArray() {
        Random rand = new Random();
        //initialize array
        int[] array = new int[UsefulFunctions.arraySize()];

        //variable that will be sum elements in array
        int sumArrayElements = 0;

        for (int i = 0; i < array.length; i++) {
            //draw elements of array from range <4, 10>
            array[i] = rand.nextInt(7) + 4;
            //while sum of currently drawn number and previous array elements
            //isn't a prime number we will draw current number again
            while (!UsefulFunctions.isPrimeNumber((sumArrayElements + array[i]))) {
                array[i] = rand.nextInt(7) + 4;
            }
            sumArrayElements += array[i];
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(drawArray()));
    }
}
