/*Given a string and an index, return a string length 2 starting
at the given index. If the index is too big or too small to
define a string length 2, use the first 2 chars. The string
length will be at least 2.*/

package string1;

public class TwoChar {
    public static void main(String[] args) {
        System.out.println(twoChar("java", 0));
        System.out.println(twoChar("java", 2));
        System.out.println(twoChar("java", 3));
    }

    public static String twoChar(String str, int index) {
        if (index > str.length() - 2 || str.length() == 2 || index < 0){
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }
}
