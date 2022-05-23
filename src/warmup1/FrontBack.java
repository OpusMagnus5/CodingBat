package warmup1;

//Given a string, return a new string where the first and last chars have been
//exchanged

public class FrontBack {
    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
    }

    public static String frontBack(String str) {
        if (str.length() < 2){
            return str;
        } else if (str.length() == 2){
            return Character.toString(str.charAt(1)) + Character.toString(str.charAt(0));
        }

        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1)
                + str.charAt(0);
    }
}
