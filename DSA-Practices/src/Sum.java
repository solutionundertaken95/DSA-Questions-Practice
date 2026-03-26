import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int n1 = scanner.nextInt();
        System.out.println();
        System.out.print("Enter the second number : ");
        int n2 = scanner.nextInt();
        System.out.println();
        int sum = 0;

        sum = n1 + n2;

        System.out.println("Sum of the 2 numbers is : " + sum);
    }
}
