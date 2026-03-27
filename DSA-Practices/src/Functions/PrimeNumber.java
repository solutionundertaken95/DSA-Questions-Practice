package Functions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = scanner.nextInt();

        if(isPrime(n)){
            System.out.println("Prime Number ");
        }
        else
            System.out.println("Not Prime Number");
    }

    private static boolean isPrime(int n) {

        for (int i = 2; i <= n/2; i++) {

            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
