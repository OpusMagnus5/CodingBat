/*Given a string, does "xyz" appear in the middle of the string?
To define middle, we'll say that the number of chars to the left
and right of the "xyz" must differ by at most one. This problem
is harder than it looks.*/

public class xyzMiddle {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
    }

    public static boolean xyzMiddle(String str) {
        for (int i = 0; i < str.length() - 2; i++){
            int differnceLR = str.length() - i - 3;
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z'){
                if (i == differnceLR || i - differnceLR == 1 || i - differnceLR == -1){
                    return true;
                }
            }
        }
        return false;
    }
}
