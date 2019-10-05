package pl.app.azdrojewska.strings;

/**
 * Created by Anna Zdrojewska on 2017-01-03.
 * Email: anna_zdrojewska@interia.eu
 *
 *
 * Created for KM-PROGRAMS
 * http://km-programs.pl/
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        //it must be short (1, 2 or 3 letters), because the square of writing length must be less than 10
        System.out.println("Enter the writing:");
        Scanner sc = new Scanner(System.in);
        String writing = sc.nextLine();

        int a = writing.length();
        //check the square of writing length
        if((a*a) >= 10 ){
            do{
                //if it's greater than 10, the writing will be entered again
                System.out.println("Wrong writing, please enter new one:");
                Scanner sc2 = new Scanner(System.in);
                writing = sc2.nextLine();

            }while((writing.length()*writing.length()) >= 10);
        }
        System.out.println("You entered a good writing");

        System.out.println("Separating the writing on letters: ");
        //separate the writing with split function
        String[] separateWriting = writing.split("{2}");
        System.out.println(Arrays.toString(separateWriting));

        System.out.println("Separating writings in table: ");
        //create a matrix with the same numbers of rows and columns
        String [][] tab = new String[writing.length()][writing.length()];
        //write to the matrix a separate writing as many times as the matrix length
        for(int i = 0; i< tab.length; i++){
            tab[i] = Arrays.copyOf(separateWriting, tab.length);
        }
        System.out.println(Arrays.deepToString(tab));

        //read the array with columns and create a new writing
        String newWriting = "";
        for(int i = 0; i< tab.length; i++){
            for(int j = 0; j< tab[i].length; j++){
                newWriting += tab[j][i];
            }
        }
        System.out.println("New writing: " + newWriting);

    }
}
