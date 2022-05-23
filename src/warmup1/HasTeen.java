package warmup1;

/*We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 3 int values, return true if 1 or more of them are teen.*/

public class HasTeen {
    public static void main(String[] args) {
        System.out.println(hasTeen(13, 20, 10));
        System.out.println(hasTeen(20, 19, 10));
        System.out.println(hasTeen(20, 10, 13));
    }

    public static boolean hasTeen(int a, int b, int c) {
        for (int i = 13; i <= 19; i++){
            if (a == i || b == i || c == i){
                return true;
            }
        }
        return false;
    }
    //TODO ostatnie
}
