package ProgrammingBasics;

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

public class Exercise1 {

    //check a prime number
    public static boolean primeNumber(int element) {
        for(int i = 2; i <= element/2; i++) {
            if(element%i == 0) {
                return false;
            }
        }
        return true;
    }

    //generate an array with elements <4,10>
    public static int[] generateArray(){
        int size = 5;
        int[] array = new int[size];
        Random rand = new Random();
        //variable that will be counting element values
        int count = 0;
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(7)+4;
            //while sum of currently drawn number and previous array elements
            //isn't a prime number we will draw current number again
            while(!primeNumber(count + array[i])){
                array[i]  = rand.nextInt(7)+4;
            }
            count += array[i];
        }
        return array;
    }
    public static void main(String[] args) {
        //print generated array
        System.out.println(Arrays.toString(generateArray()));

    }
}
