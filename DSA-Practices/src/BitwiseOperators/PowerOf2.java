package BitwiseOperators;

public class PowerOf2 {
    public static void main(String[] args) {

        int n = 16;

        boolean s = n > 0 && (n & (n - 1)) == 0;
        System.out.println(s);

    }
}
