package warmup2;

/*Given 2 strings, a and b, return the number of the positions where
they contain the same length 2 substring. So "xxcaazz" and "xxbaaz"
yields 3, since the "xx", "aa", and "az" substrings appear in the same
place in both strings.*/

public class StringMatch {
    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
    }

    public static int stringMatch(String a, String b) {
        int count = 0;
        for (int i = 1; i < a.length() && i < b.length(); i++){
            if (a.charAt(i - 1) == b.charAt(i - 1) &&
            b.charAt(i) == a.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
