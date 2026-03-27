import java.util.Scanner;

public class FindingLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (true){
           int num = scanner.nextInt();

           if(num == 0){
               break;
           }

           if(max< num){
               max = num;
           }
        }

        System.out.println("The Maximum Number is : " + max);
    }
}
