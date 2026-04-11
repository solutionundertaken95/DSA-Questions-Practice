import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int factors = 20;
        printTheFactors(factors);
    }

    private static void printTheFactors(int factors) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(factors); i++) {

            if(factors % i == 0){

                if(factors/i == i){
                    System.out.print(i + " ");
                }

                arrayList.add(factors/i);
                System.out.print(i + " ");


            }

        }

        for (int i = arrayList.size() - 1; i >= 0 ; i--) {
            System.out.print(arrayList.get(i) + " ");

        }
    }
}
