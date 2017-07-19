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

public class Exercise5 {
    //check if 3 points from user are collinear
    //if not user must enter them again and again
    public static void collinearPoints(){
        int[] a = new int[2];
        int[] b = new int[2];
        int[] c = new int[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates of point A: ");
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        System.out.println("Enter coordinates of point B: ");
        b[0] = sc.nextInt();
        b[1] = sc.nextInt();
        System.out.println("Enter coordinates of point C: ");
        c[0] = sc.nextInt();
        c[1] = sc.nextInt();
        //condition tells that points are collinear
        //when (ay-by)/(ax-bx) == (ay-cy)/(ax-cx)
        while(!(((a[1]-b[1])/(a[0]-b[0]))==((a[1]-c[1])/(a[0]-c[0])))){
            System.out.println("Enter coordinates of point A: ");
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            System.out.println("Enter coordinates of point B: ");
            b[0] = sc.nextInt();
            b[1] = sc.nextInt();
            System.out.println("Enter coordinates of point C: ");
            c[0] = sc.nextInt();
            c[1] = sc.nextInt();

        }
        System.out.println("Correct! A=" + Arrays.toString(a) + " B=" + Arrays.toString(b) + " C=" + Arrays.toString(c));
    }
    public static void main(String[] args) {
        collinearPoints();
    }
}
