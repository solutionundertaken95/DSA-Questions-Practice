public class PrimeUntilN {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        isprimes(n,primes);
    }

    private static void isprimes(int n, boolean[] primes) {

        if(n<=1){
            System.out.println("There are no prime numbers in this range");
            return;
        }

        for (int i = 2; i * i<=n ; i++) {

            if(!primes[i]){
                for (int j = 2*i; j <=n; j+=i) {
                    primes[j] = true;

                }
            }

        }

        for (int i = 2; i <=n ; i++) {
            if(!primes[i]){
                System.out.println(i + " ");
            }

        }
    }
}
