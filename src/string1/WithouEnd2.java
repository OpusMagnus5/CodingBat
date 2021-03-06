/*Given a string, return a version without both the first and last
char of the string. The string may be any length, including 0.*/

package string1;

public class WithouEnd2 {
    public static void main(String[] args) {
        System.out.println(withouEnd2("Hello"));
        System.out.println(withouEnd2("abc"));
        System.out.println(withouEnd2("ab"));
    }

    public static String withouEnd2(String str) {
        if (str.length() <= 2){
            return "";
        }
        return str.substring(1, str.length() - 1);
    }
}
