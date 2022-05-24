package warmup1;

/*Return true if the given string begins with "mix", except the 'm' can be
anything, so "pix", "9ix" .. all count.*/

public class MixStart {

    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("piz snacks"));
    }

    public static boolean mixStart(String str) {
        return str.length() >= 3 && str.charAt(1) == 'i'
                && str.charAt(2) == 'x';
    }
}
