/*Given a string, return a "rotated left 2" version where the first 2 chars
are moved to the end. The string length will be at least 2.*/

package string1;

public class Left2 {
    public static void main(String[] args) {
        System.out.println(left2("Hello"));
        System.out.println(left2("java"));
        System.out.println(left2("Hi"));
    }

    public static String left2(String str) {
        if (str.length() == 2){
            return str;
        }
        return str.substring(2) + str.substring(0, 2);
    }
}
