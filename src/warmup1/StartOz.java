package warmup1;

/*Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second
only if it is 'z', so "ozymandias" yields "oz".*/

public class StartOz {
    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));
    }

    public static String startOz(String str) {
        if (str.length() >= 2 && str.charAt(0) == 'o' && str.charAt(1) == 'z'){
            return "oz";
        } else if (str.length() >= 1 && str.charAt(0) == 'o'){
            return "o";
        } else if (str.length() >= 2 && str.charAt(1) == 'z'){
            return "z";
        }
        return "";
    }
}
