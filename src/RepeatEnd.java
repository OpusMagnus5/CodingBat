/*Given a string and an int n, return a string made of n repetitions
of the last n characters of the string. You may assume that n is
between 0 and the length of the string, inclusive.*/

public class RepeatEnd {
    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 3));
    }

    public static String repeatEnd(String str, int n) {
//        return str.substring(str.length() - n, str.length()).repeat(n);
        String repeatStr = str.substring(str.length() - n);
        for (int i = 0; i < n - 1; i++){
            repeatStr = repeatStr + str.substring(str.length() - n);
        }
        return repeatStr;
    }
}

