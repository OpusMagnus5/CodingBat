/*Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.*/

package string1;

public class SeeColor {
    public static void main(String[] args) {
        System.out.println(seeColor("redxx"));
        System.out.println(seeColor("xxred"));
        System.out.println(seeColor("blueTimes"));
    }

    public static String seeColor(String str) {
        if (str.startsWith("red")){
            return "red";
        }else if (str.startsWith("blue")){
            return "blue";
        }
        return "";
    }
}
