package warmup2;

/*
Given a string and a non-negative int n, return a larger string that is
n copies of the original string.
*/

public class StringTimes {
    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));
    }

    public static String stringTimes(String str, int n) {
        String str2 = "";
        for (int i = 0; i < n; i++){
            str2 += str;
        }
        return str2;
    }
}
