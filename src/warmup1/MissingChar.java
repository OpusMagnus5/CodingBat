package warmup1;/*Given a non-empty string and an int n, return a new string
where the char at index n has been removed. The value of n
will be a valid index of a char in the original string
(i.e. n will be in the range 0..str.length()-1 inclusive).*/

public class MissingChar {
    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));
        System.out.println(missingChar("kitten", 5));
    }

    public static String missingChar(String str, int n) {
        String str1 = str.substring(0, n);
        if (n == 0){
            return str.substring(1);
        }
        else if (n < str.length()){
            String str2 = str.substring(n + 1);
            return str1 + str2;
        }

        return str1;
    }
}
