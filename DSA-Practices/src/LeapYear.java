import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year to check");
        int year = scanner.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0 )){
            System.out.println("It is a leap year");
        }
        else
            System.out.println("Not a leap year");
    }
}
