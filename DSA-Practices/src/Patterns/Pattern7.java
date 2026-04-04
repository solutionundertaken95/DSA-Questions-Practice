package Patterns;

/*

            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5

 */


public class Pattern7 {
    public static void main(String[] args) {

        int n = 5;
        printPattern(n);

    }


    private static void printPattern(int n) {

        for (int i = 1; i <=n; i++) {



            for (int spaces = 0; spaces < n - i; spaces++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1 ; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2; j <= i ; j++) {
                System.out.print(j + " ");
            }



            System.out.println();
        }
    }
}
