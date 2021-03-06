package warmup2;

/*Given a string and a non-negative int n, we'll say that the front of
the string is the first 3 chars, or whatever is there if the string is
less than length 3. Return n copies of the front*/

public class FrontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));
    }

    public static String frontTimes(String str, int n) {
        String str2 = "";
        if (str.length() > 3){
            str = str.substring(0, 3);
        }
        for (int i = 0; i < n; i++){
            str2 += str;
        }
        return str2;
    }
}
