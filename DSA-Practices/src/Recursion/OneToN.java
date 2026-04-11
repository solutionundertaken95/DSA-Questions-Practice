package Recursion;

public class OneToN {
    public static void main(String[] args) {
        int n = 5;

        func2(n);
    }

    private static void func(int n) {

        if(n==0){
            return;
        }

        System.out.println(n);
        func(n-1);
    }

    private static void func2(int n) {

        if(n==0){
            return;
        }

        func2(n-1);
        System.out.println(n);

    }


}
