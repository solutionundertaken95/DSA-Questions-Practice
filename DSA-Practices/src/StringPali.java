public class StringPali {
    public static void main(String[] args) {
        String string = null;
        System.out.println(isPalindrome(string));
    }

    private static boolean isPalindrome(String string) {

        if( string == null || string.isEmpty()){
            return false;
        }

        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            char start = string.charAt(i);

            char end = string.charAt(string.length() - 1 - i);

            if(start != end){
                return false;
            }
        }

        return true;
    }
}
