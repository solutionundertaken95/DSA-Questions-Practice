import java.util.Scanner;

public class HCFLCM {
    //basically you are subtracting one number from the other until each becomes equal, then that becomes the highest common factor
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();

        System.out.println("Enter second number");
        int b = scanner.nextInt();

        int x = a;
        int y = b;

        while(x!=y){
            if(x>y){
                x = x-y;
            } else if (y>x) {
                y = y-x;
            }
        }
        System.out.println("HCF = " +x);
        int lcm = ((a*b)/x);
        System.out.println("LCM = " +lcm);
    }
}
