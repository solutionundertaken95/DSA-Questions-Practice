package Recursion;

public class PhonePad {
    public static void main(String[] args) {
        String str = "19";
        numpad("",str);
    }

    private static void numpad(String processed, String unprocessed) {

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int digit = unprocessed.charAt(0) - '0';

        for (int i = (digit-1) * 3; i < digit*3; i++) {

            char ch = (char) ('a' + i);

            if(i==25){
                i = i +1;
            }

            numpad(processed + ch, unprocessed.substring(1));

        }

    }
}
