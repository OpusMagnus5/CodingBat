package warmup2;

/*Given a string, return a version where all the "x" have been removed.
Except an "x" at the very start or end should not be removed.*/

public class StringX {
    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
    }

    public static String stringX(String str) {
        String str2 = "";
        if (str.length() >= 1 && str.charAt(0) == 'x') {
            str2 = "x";
        }
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != 'x'){
                str2 += str.charAt(i);
            }
        }
        if (str.length() >= 2 && str.charAt(str.length() - 1) == 'x'){
            str2 += 'x';
        }
        return str2;
    }
}
