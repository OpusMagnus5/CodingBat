package warmup1;

/*Given 2 positive int values, return the larger value that is
in the range 10..20 inclusive, or return 0 if neither is in that range.*/

public class Max1020 {
    public static void main(String[] args) {
        System.out.println(max1020(11, 19));
        System.out.println(max1020(19, 11));
        System.out.println(max1020(11, 9));
    }

    public static int max1020(int a, int b) {
        if (a >= 10 && a <= 20){
            if (b >= 10 && b <= 20){
                if (a >= b){
                    return a;
                }
                else {
                    return b;
                }
            }
            return a;
        } else if (b >= 10 && b <= 20){
            return b;
        }
        return 0;
    }
}
