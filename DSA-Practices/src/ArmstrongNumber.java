import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the range between which to find armstrong numbers");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        for(int i=n1;i<=n2;i++){
            if(isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }

    private static boolean isArmstrong(int i) {

        int temp = i;
        int original = i;
        int digits = 0;
        int sum =0;

        while(temp>0){
            digits++;
            temp /=10;
        }

        while(i>0){
            int d = i%10;
            sum += Math.pow(d,digits);
            i/=10;
        }

        return (original == sum);

    }
}
