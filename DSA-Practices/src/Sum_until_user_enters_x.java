import java.util.Scanner;

public class Sum_until_user_enters_x {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     int sum = 0;

     while(true){
         System.out.print("Enter number : ");
         String input = scanner.next();

         if(input.equalsIgnoreCase("x")){
             break;
         }

         int num = Integer.parseInt(input);
         sum+=num;
     }

        System.out.println("The sum is : " +sum);
    }
}
