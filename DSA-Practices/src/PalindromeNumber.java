import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        int rev = 0;
        int temp = num;

        while(num>0){

            int d = num % 10;
            rev = rev * 10 + d;
            num = num/10;

        }

        if(rev == temp){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");




    }
}
