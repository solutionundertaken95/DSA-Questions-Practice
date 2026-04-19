package BackTracking;

public class Maze {
    public static void main(String[] args) {
        int count = maze(3,3);
        System.out.println(count);

        mazeprint("",3,3);
    }

    private static int maze(int r, int c) {

        if(r == 1 || c == 1){
            return 1;
        }

        int left = maze(r-1,c);

        int right = maze(r,c-1);

        return left+right;

    }

    private static void mazeprint(String p, int r, int c) {

        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            mazeprint(p + 'D',r-1,c);
        }

        if(c > 1){
            mazeprint(p + 'R',r,c-1);
        }

    }

}
