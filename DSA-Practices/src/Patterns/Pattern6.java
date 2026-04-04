package Patterns;


/*

            *
           * *
          * * *
         * * * *
        * * * * *
         * * * *
          * * *
           * *
            *

*/


public class Pattern6 {
    public static void main(String[] args) {

        int n = 5;
        printPattern(n);

    }

    private static void printPattern(int n) {

        for (int i = 1; i < 2 * n; i++) {

            int c = i > n ? 2 * n - i : i;
            int spaces = n - c;

            // spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // stars with spaces
            for (int j = 0; j < c; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
