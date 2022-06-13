/*Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
and otherwise return the string unchanged.*/

package string1;

public class WithoutX {
    public static void main(String[] args) {
        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX("Hxix"));
    }

    public static String withoutX(String str) {
        if (str.startsWith("x") && str.endsWith("x")){
            if (str.length() >= 2){
                return str.substring(1, str.length() - 1);
            }else{
                return "";
            }
        }else if (str.startsWith("x")){
            if (str.length() > 1){
                return str.substring(1);
            } else{
                return "";
            }
        }else if (str.endsWith("x")){
            return str.substring(0, str.length() - 1);
        }
        return str;
    }
}
