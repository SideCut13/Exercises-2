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
import java.util.Scanner;

public class Exercise3 {
    //increase of our array by average of even indexes
    public static double[] increaseArray(double avg, double[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] += avg;
        }
        return array;
    }
    // count average of elements values from even indexes
    public static double evenIndexes(double[] array){
        //variable count values of array elements
        double temp = 0;
        //count a number of even indexes
        int count =0;
        for (int i = 0; i < array.length; i++) {
            if(i%2 ==0 && i >0){
                temp += array[i];
                count++;
            }
        }
        double avg = temp/count;
        return avg;

    }
    // take size and element of array from user
    public static double[] userArray(double[] array){
        System.out.println("Enter a size of your array: ");
        Scanner sc = new Scanner(System.in);
        int sizeArray = sc.nextInt();
        array = new double[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            System.out.println("Enter " + i + " element: ");
            array[i] = sc.nextDouble();
        }
        return array;
    }
    public static void main(String[] args) {
        double[] array = new double[]{};
        array = userArray(array);
        double avg = evenIndexes(array);
        System.out.println("OUTPUT ARRAY: " + Arrays.toString(increaseArray(avg, array)));
    }
}
