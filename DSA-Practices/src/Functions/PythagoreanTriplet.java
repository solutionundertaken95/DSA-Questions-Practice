package Functions;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int max = Math.max(n1, Math.max(n2, n3));

        int sum;

        if (max == n1) {
            sum = n2 * n2 + n3 * n3;
            if (sum == n1 * n1) {
                System.out.println("Pythagorean Triplet");
                return;
            }
        } else if (max == n2) {
            sum = n1 * n1 + n3 * n3;
            if (sum == n2 * n2) {
                System.out.println("Pythagorean Triplet");
                return;
            }
        } else {
            sum = n1 * n1 + n2 * n2;
            if (sum == n3 * n3) {
                System.out.println("Pythagorean Triplet");
                return;
            }
        }

        System.out.println("Not Pythagorean Triplet");
    }
}