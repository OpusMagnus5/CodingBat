/*Given two strings, a and b, create a bigger string made of
the first char of a, the first char of b, the second char of a,
the second char of b, and so on. Any leftover chars go at the end
of the result.*/

public class MixString {
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
    }

    public static String mixString(String a, String b) {
        String mix = "";
        for (int i = 0; i < a.length() || i < b.length(); i++){
            if (i < a.length()) {
                mix += a.substring(i, i + 1);
            }
            if (i < b.length()){
                mix += b.substring(i, i + 1);
            }
        }
        return mix;
    }

}
