package warmup2;

/*Given a string, return true if the first instance of "x" in the string
is immediately followed by another "x".*/

public class DoubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
    }

    public static boolean doubleX(String str) {
        int i;
        for (i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'x'){
                if (str.length() - 1 >= i + 1 && str.charAt(i + 1) == 'x'){
                    return true;
                }
                return false;
            }
        }
        return false;
    }

}
