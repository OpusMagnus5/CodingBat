package warmup1;

public class IntMax {
    public static void main(String[] args) {
        System.out.println(intMax(1, 2, 3));
        System.out.println(intMax(1, 3, 2));
        System.out.println(intMax(3, 2, 1));
    }

    public static int intMax(int a, int b, int c) {
        if (a >= b && a >= c){
            return a;
        }
        if (b >= c && b >= a){
            return b;
        }
        return c;
    }
}
