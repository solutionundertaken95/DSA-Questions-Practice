public class squareRoot {
    public static void main(String[] args) {
        int n = 40;

        //Precision
        int p = 3;

        System.out.printf("%.3f",sqroot(n,p));
    }

    private static double sqroot(int n, int p) {

        double root = 0.0;

        int start = 0;
        int end = n;

        while( start <= end){

            int mid = start + (start - end)/2;

            if (mid * mid == n){
                return mid;
            } else if (mid * mid > n) {
                end = mid - 1;
            }
            else
                start = mid + 1;

        }

        double incr = 0.1;
        for (int i = 1; i <= p ; i++) {

            while (root * root <= n){
                root+=incr;
            }
            root-=incr;
            incr/=10;

        }

        return root;
    }
}
