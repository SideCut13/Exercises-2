package pl.app.azdrojewska.programming_basics;

import java.util.Scanner;

/**
 * Last changes by Anna Zdrojewska on 2019-10-05.
 *
 * Created for KM-PROGRAMS
 * http://km-programs.pl/
 */

public class Exercise2 {

    //take 3 numbers (a, b, c) from user
    private static void userNumbers() {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter c: ");
        do {
            c = sc.nextInt();
        } while (c <= 0);

        //while a + b isn't a prime number and isn't greater than c
        //take a and b again and again
        do {
            System.out.print("Enter a: ");
            a = sc.nextInt();

            System.out.print("Enter b: ");
            b = sc.nextInt();
        } while (!UsefulFunctions.isPrimeNumber(a + b) && a + b > c);

        System.out.println("Correct numbers! a = " + a + ", b = " + b + ", c = " + c);
    }

    public static void main(String[] args) {
        userNumbers();
    }
}
