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

import java.util.Scanner;

public class Exercise2 {
    //check a prime number
    public static boolean primeNumber(int element) {
        for(int i = 2; i <= element/2; i++) {
            if(element%i == 0) {
                return false;
            }
        }
        return true;
    }
    // we take from user 3 numbers: a, b, c
    public static void userNumbers(){
        int a, b, c;
        System.out.println("Enter 3 numbers: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        // while a+b isn't a prime number and isn't greater than c
        // take a and b again and again
        while(!primeNumber(a+b) && a+b >c){
            System.out.println("Incorrect numbers, enter again: ");
            a = sc.nextInt();
            b = sc.nextInt();
        }
        System.out.println("Correct numbers! a = " + a + " b = " + b + " c = " + c);
    }
    public static void main(String[] args) {
        userNumbers();
    }
}
