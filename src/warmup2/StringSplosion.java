package warmup2;

/*Given a non-empty string like "Code" return a string like "CCoCodCode".*/

public class StringSplosion {
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));
    }

    public static String stringSplosion(String str) {
        String str2 = "";
        for (int i = 1; i <= str.length(); i++){
            str2 += str.substring(0, i);
        }
        return str2;
    }
}
