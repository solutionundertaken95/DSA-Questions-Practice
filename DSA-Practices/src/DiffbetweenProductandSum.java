import java.util.Scanner;

public class DiffbetweenProductandSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number :");
        int num = scanner.nextInt();

        int diff = subtractProductAndSum(num);
        System.out.println("The difference is : " +diff);
    }

    private static int subtractProductAndSum(int num) {
        int temp = num;
        int sum=0;
        int product = 1;

        while(num>0){
            int d = num % 10;
            sum += d;
            product *= d;
            num=num/10;
        }

        int diff = product - sum ;
        return diff;

    }
}
