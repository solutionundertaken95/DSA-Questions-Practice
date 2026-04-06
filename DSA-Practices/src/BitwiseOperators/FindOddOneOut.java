package BitwiseOperators;

public class FindOddOneOut {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,5,6,7,6,7,4};

        System.out.println(oddone(arr));
    }

    private static int oddone(int[] arr) {
        int unique = 0;
        for (int i : arr) {
            unique ^= i;
        }

        return unique;
    }
}
