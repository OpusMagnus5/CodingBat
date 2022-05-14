public class MakeBricks {
    public static void main(String[] args) {
        System.out.println(makeBricks(20, 4, 51));
    }

    public static boolean makeBricks(int small, int big, int goal){
        if(big * 5 == goal){
            return true;
        }
        else if(big * 5 < goal){
            int difference;
            difference = goal - big * 5;
            if(difference <= small){
                return true;
            }
            else{
                return false;
            }
        }else {
            return makeBricks(small, goal / 5, goal);
        }
    }
}
