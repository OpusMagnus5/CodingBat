/*Suppose the string "yak" is unlucky. Given a string, return a version where
all the "yak" are removed, but the "a" can be any char. The "yak" strings
will not overlap.*/

package warmup2;

public class StringYak {
    public static void main(String[] args) {
        System.out.println(stringYak("HiyakHi"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123ya"));
    }

    public static String stringYak(String str) {
        String str2 = "";
        if (str.length() <= 2){
            return str;
        }
        for (int i = 0; i < str.length(); i++){
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k'){
                if (i + 3 <= str.length() - 1){
                    str = str.substring(i + 3);
                    i = -1;
                }else{
                    break;
                }
            }else {
                str2 += str.charAt(i);
            }
        }
        return str2;
    }
}
