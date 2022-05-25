package warmup2;

/*Count the number of "xx" in the given string. We'll say that overlapping
is allowed, so "xxx" contains 2 "xx".*/

public class CountXX {
    public static void main(String[] args) {
        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
    }

    public static int countXX(String str) {
        int count = 0;
        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i - 1) == 'x' && str.charAt(i) == 'x'){
                count++;
            }
        }
        return count;
    }
}
