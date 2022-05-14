public class Blackjack {
    public static void main(String[] args) {
        System.out.println(blackjack(19, 22));
    }

    public static int blackjack(int a, int b){
        int nearA = 22, nearB = 22;
        if(a > 21 && b > 21){
            return 0;
        }
        if(a <= 21){
            nearA = 21 - a;
        }
        if(b <= 21){
            nearB = 21 - b;
        }
        if(nearA <= nearB){
            return a;
        }
        return b;
    }
}
