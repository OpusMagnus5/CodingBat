package warmup1;

//Return true if the given string contains between 1 and 3 'e' chars.

public class StringE {
    public static void main(String[] args) {
        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));
    }

    public static boolean stringE(String str) {
        int countE = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'e'){
                countE++;
            }
        }
        return countE >= 1 && countE <= 3;
    }
}
