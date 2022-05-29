/*We'll say that a "triple" in a string is a char appearing three times in a row.
Return the number of triples in the given string. The triples may overlap.*/

package String3;

public class countTriple {
    public static void main(String[] args) {
        System.out.println(countTriple("abcXXXabc"));
        System.out.println(countTriple("xxxabyyyycd"));
        System.out.println(countTriple("a"));
    }

    public static int countTriple(String str) {
        int count = 0;
        for (int i = 2; i < str.length(); i++){
            if (str.charAt(i) == str.charAt(i - 1) && str.charAt(i) == str.charAt(i - 2)){
                count++;
            }
        }
        return count;
    }
}
