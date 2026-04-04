package Patterns;

/*

 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *


*/

public class Pattern4 {
    public static void main(String[] args) {

        int n = 5;
        printPattern3(n);

    }

//Brute Force
    private static void printPattern(int n) {

        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=i; j ++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1 ; i<= n-1; i++) {
            for(int j = n - i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//My Approach
    private static void printPattern2(int n) {

        for(int i = 1;i < 2 * n; i++){

            int c = 0;

            if(i>n){
                int diff = i - n;
                c = n - diff;
            }
            else {
                c = i;
            }

            for (int col = 1; col <= c; col++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
//Kunal Approach
    private static void printPattern3(int n) {

        for(int i = 1;i < 2 * n; i++){

            int c = i>n ?  2*n -i:i;

            for (int col = 1; col <= c; col++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
