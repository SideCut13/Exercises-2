package ProgrammingBasics;

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

public class Exercise4 {
    //generate second array with first value = 0
    //every next element is sum of elements from first array
    //with indexes 0 to i-1
    public static int[] generateSecondArray(int[] array, int[] secondArray){
        secondArray[0] = 0;
        for (int i = 1; i < secondArray.length; i++) {
            if(i == 1){
                secondArray[i] = array[i-1];
            }
            else{
                secondArray[i] = secondArray[i-1] + array[i-1];
            }
        }
        return secondArray;
    }
    //generate first array with values <5, 20>
    public static int[] generateArray(int[] array){
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(16) + 5;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] secondArray = new int[5];

        //output arrays
        System.out.println("FIRST ARRAY: " + Arrays.toString(generateArray(array)));
        System.out.println("SECOND ARRAY: " + Arrays.toString(generateSecondArray(array, secondArray)));
    }
}
