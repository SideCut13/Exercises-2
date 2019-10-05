package pl.app.azdrojewska.programming_basics;

import java.util.Scanner;

//class with some useful functions for package programming_basics
public class UsefulFunctions {

    //check if number is a prime number
    protected static boolean isPrimeNumber(int number) {
        if (number <= 0 || number == 1) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //get size of an array from user
    protected static int arraySize() {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.print("Please, enter the size of the array: ");
            size = sc.nextInt();
        } while (size <= 0);
        return size;
    }
}
