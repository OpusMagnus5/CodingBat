/*Given 3 int values, a b c, return their sum. However, if one of
the values is 13 then it does not count towards the sum and values
to its right do not count. So for example, if b is 13,
then both b and c do not count.*/

public class LuckySum {
    public static void main(String[] args) {
        System.out.println(luckySum(1, 2, 3));
        System.out.println(luckySum(1, 2, 13));
        System.out.println(luckySum(1, 13, 3));
    }

    public static int luckySum(int a, int b, int c) {
        int sum = 0;
        int[] abc = new int[3];
        abc[0] = a;
        abc[1] = b;
        abc[2] = c;
        for (int i = 0; i < abc.length; i++){
            if (abc[i] == 13){
                break;
            }
            sum += abc[i];
        }
        return sum;
    }

}
