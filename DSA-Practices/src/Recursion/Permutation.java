package Recursion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String unprocessed = "abc";
//        permutations("",unprocessed);
        ArrayList<String> arrayList = permutations2("",unprocessed);
        System.out.println(arrayList);
    }

    private static void permutations(String processed, String unprocessed) {

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0,i);

            String second = processed.substring(i,processed.length());

            permutations(first + ch + second,unprocessed.substring(1));
        }
    }

    private static ArrayList<String> permutations2(String processed, String unprocessed) {

        if(unprocessed.isEmpty()){
//            System.out.println(processed);

            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(processed);
            return arrayList;
        }

        char ch = unprocessed.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0,i);

            String second = processed.substring(i,processed.length());

            ans.addAll(permutations2(first + ch + second,unprocessed.substring(1)));
        }

        return ans;
    }

}
