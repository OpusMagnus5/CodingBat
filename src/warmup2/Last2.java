package warmup2;

public class Last2 {
    public static void main(String[] args) {
        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));
    }

    public static int last2(String str) {
        int count = 0;
        for (int i = 1; i < str.length() - 2; i++){
            if ((str.charAt(str.length() - 2) == str.charAt(i - 1)) &&
            str.charAt(str.length() - 1) == str.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
