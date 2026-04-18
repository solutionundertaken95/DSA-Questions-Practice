package Recursion;

public class DiceRoll {
    public static void main(String[] args) {
        int target = 4;
        dicecount("",target);
    }

    private static void dicecount(String s, int target) {

        if(target ==0){
            System.out.println(s);
            return;
        }

        for (int i = 1; i <=6 && i<=target; i++) {

            dicecount(s + i,target - i);

        }
    }
}
