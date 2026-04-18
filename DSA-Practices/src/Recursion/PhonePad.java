package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class PhonePad {
    public static void main(String[] args) {
        String str = "19";
        ArrayList<String> arrayList = numpad2("",str);
        System.out.println(arrayList);
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


    private static ArrayList<String> numpad2(String processed, String unprocessed) {

        if(unprocessed.isEmpty()){
            ArrayList<String> stringArrayList = new ArrayList<>();
            stringArrayList.add(processed);
            return stringArrayList;
        }

        int digit = unprocessed.charAt(0) - '0';

        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = (digit-1) * 3; i < digit*3; i++) {

            char ch = (char) ('a' + i);

            if(i==25){
                i = i +1;
            }

          arrayList.addAll(numpad2(processed + ch, unprocessed.substring(1)));

        }

        return arrayList;

    }
}
