package warmup2;

/*Given a string, return a string made of the chars at indexes
0,1, 4,5, 8,9 ... so "kittens" yields "kien".*/

public class AltPairs {
    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
    }

    public static String altPairs(String str) {
        String str2 = "";
        for (int i = 0, j = 0; i < str.length(); i++, j++){
            if (j == 0 || j ==1) {
                str2 += str.charAt(i);
            }
            if (j == 2){
                i++;
                j = -1;
            }
        }
        return str2;
    }
}
