import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the string to check if it is palindrome");
        String string = scanner.next();

        boolean isPalindrome = isPalindrome(string);

        if(isPalindrome){
            System.out.println("It is palindrome");
        }
        else
            System.out.println("Not Palindrome");
    }

    private static boolean isPalindrome(String string) {

        String rev = "";
        String str = string.toLowerCase();

        for (int i = string.length() - 1; i >=0 ; i--) {
            rev = rev + str.charAt(i);
        }

        return string.equals(rev);
    }
}
