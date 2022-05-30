/*Given a string, return a "rotated right 2" version where
the last 2 chars are moved to the start. The string length
will be at least 2.*/

package string1;

public class Right2 {
    public static void main(String[] args) {
        System.out.println(right2("Hello"));
        System.out.println(right2("java"));
        System.out.println(right2("Hi"));
    }

    public static String right2(String str) {
        if (str.length() == 2) {
            return str;
        }
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }
}
