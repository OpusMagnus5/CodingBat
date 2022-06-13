/*Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
and otherwise return the string unchanged. This is a little harder than it looks.*/

package string1;

public class WithoutX2 {
    public static void main(String[] args) {
        System.out.println(withoutX2("xHi"));
        System.out.println(withoutX2("Hxi"));
        System.out.println(withoutX2("Hi"));
    }

    public static String withoutX2(String str) {
        if (str.isEmpty()){
            return str;
        }else if (str.length() == 1){
            if (str.startsWith("x")){
                return "";
            }
        }else if (str.length() == 2){
            if(str.startsWith("xx")){
                return "";
            } else if (str.startsWith("x")){
                return str.substring(1);
            } else if (str.charAt(1) == 'x'){
                return str.substring(0, 1);
            }
        }else if (str.startsWith("xx")){
            return str.substring(2);
        }else if (str.startsWith("x")){
            return str.substring(1);
        }else if (str.substring(1).startsWith("x")){
            return str.charAt(0) + str.substring(2);
        }
        return str;
    }
}
