import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to print it's multiplication table");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {

            int mul = 1;
            mul = n*i;
            System.out.println(n + " * " + i + " = " +mul);

        }
    }
}
