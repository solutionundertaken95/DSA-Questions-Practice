package Recursion;

public class skipcharacter {
    public static void main(String[] args) {

        String str = "bcdaadhsaf";
        skip("",str);
    }

    private static void skip(String processed, String unprocessed) {

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        if(ch == 'a'){
            skip(processed, unprocessed.substring(1));
        }

        else
            skip(processed + ch, unprocessed.substring(1));
    }
}
