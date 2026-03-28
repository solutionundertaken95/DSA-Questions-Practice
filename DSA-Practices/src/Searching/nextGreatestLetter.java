package Searching;

public class nextGreatestLetter {
    public static void main(String[] args) {
        char [] chars = {'c','f','j'};

        char target = 'f';

        char letter = nextGreatestletter(chars,target);

        System.out.println(letter);
    }

    private static char nextGreatestletter(char[] letters, char target) {

        int start = 0;

        int end = letters.length -1;

        while(start <=end){

            int mid = start + (end-start)/2;

            if( letters[mid] > target){
                end = mid -1 ;
            }
            else
                start = mid + 1;
        }

        return letters[start % letters.length];
    }
}
