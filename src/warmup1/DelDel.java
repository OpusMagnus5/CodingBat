package warmup1;

/*Given a string, if the string "del" appears starting at index 1, return
a string where that "del" has been deleted. Otherwise, return the string
unchanged.*/

import java.util.Locale;

public class DelDel {
    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));
    }

    public static String delDel(String str) {
        if (str.length() >= 4 && str.charAt(1) == 'd' && str.charAt(2) == 'e'
        && str.charAt(3) == 'l'){
            return str.charAt(0) + str.substring(4);
        }
        return str;
    }
}
