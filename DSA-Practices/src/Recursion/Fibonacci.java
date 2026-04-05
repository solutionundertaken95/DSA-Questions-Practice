package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;

        int fib = calculateFibonacci(n);
        System.out.println("The Fibonaci Number at " + n + " term is : " +fib);
    }

    private static int calculateFibonacci(int n) {

        if(n< 2){
            return n;
        }
        return calculateFibonacci(n - 1) + calculateFibonacci( n - 2);
    }
}
