//Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

package string1;

public class FrontAgain {
    public static void main(String[] args) {
        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));
    }

    public static boolean frontAgain(String str) {
        if (str.length() < 2){
            return false;
        }
        return str.endsWith(str.substring(0, 2));
    }
}
