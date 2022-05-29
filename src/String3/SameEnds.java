/*Given a string, return the longest substring that appears at both the beginning
and end of the string without overlapping. For example, sameEnds("abXab") is "ab".*/

package String3;

public class SameEnds {
    public static void main(String[] args) {
        System.out.println(sameEnds("abXYab"));
        System.out.println(sameEnds("xx"));
        System.out.println(sameEnds("xxx"));
    }

    public static String sameEnds(String string) {
        String str = "";

        for (int i = (string.length() / 2); i >= 0; i--){
            if (string.endsWith(string.substring(0, i))){
                str = string.substring(0, i);
                break;
            }
        }
        return str;
    }
}

