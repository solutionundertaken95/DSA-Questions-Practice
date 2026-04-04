package Patterns;

/*

 *****
 ****
 ***
 **
 *


*/


public class Pattern2 {
    public static void main(String[] args) {

        int n = 5;
        printPattern(n);

    }



private static void printPattern(int n) {

    for(int i = 0;i<n;i++){
        for(int j = n - i; j > 0 ; j -- ){
            System.out.print("*");
        }
        System.out.println();
    }
}
}

