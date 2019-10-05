package pl.app.azdrojewska.programming_basics;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Last changes by Anna Zdrojewska on 2019-10-05.
 *
 * Created for KM-PROGRAMS
 * http://km-programs.pl/
 */

public class Exercise5 {

    private static final int SIZE = 2;

    //check if 3 points from user are collinear
    //if not user must enter them again
    private static void collinearPoints() {
        //initializing 3 arrays with size 2
        //fot 2 coordinates
        int[] a = new int[SIZE];
        int[] b = new int[SIZE];
        int[] c = new int[SIZE];

        Scanner sc = new Scanner(System.in);

        //condition tells that points are collinear
        //when (ay-by)/(ax-bx) == (ay-cy)/(ax-cx)
        do {
            System.out.println("Enter coordinates of point A: ");
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            System.out.println("Enter coordinates of point B: ");
            b[0] = sc.nextInt();
            b[1] = sc.nextInt();
            System.out.println("Enter coordinates of point C: ");
            c[0] = sc.nextInt();
            c[1] = sc.nextInt();
        } while (!(((a[1] - b[1]) / (a[0] - b[0])) == ((a[1] - c[1]) / (a[0] - c[0]))));

        System.out.println("Correct! A=" + Arrays.toString(a) + ", B=" + Arrays.toString(b) + ", C=" + Arrays.toString(c));
    }

    public static void main(String[] args) {
        collinearPoints();
    }
}
