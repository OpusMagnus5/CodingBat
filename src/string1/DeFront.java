/*Given a string, return a version without the first 2 chars. Except keep the first
char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.*/

package string1;

public class DeFront {
    public static void main(String[] args) {
        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
    }

    public static String deFront(String str) {
        String outString = "";
        if (str.length() >= 1 ){
            if (str.charAt(0) == 'a'){
                outString += "a";
            }
        }
        if (str.length() >= 2){
            if (str.charAt(1) == 'b'){
                outString += "b";
            }
        }
        if (str.length() > 2){
            outString += str.substring(2);
        }
        return outString;
    }
}
