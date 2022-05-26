package warmup2;

/*Given an array of ints, return true if the sequence of numbers 1, 2, 3
appears in the array somewhere.*/

public class Array123 {
    public static void main(String[] args) {
        System.out.println(array123(new int[]{1, 1, 2, 3, 1}));
        System.out.println(array123(new int[]{1, 1, 2, 4, 1}));
        System.out.println(array123(new int[]{1, 1, 2, 1, 2, 3}));
    }

    public static boolean array123(int[] nums) {
        for (int i = 2; i < nums.length; i++){
            if (nums[i - 2] == 1 && nums[i - 1] == 2 && nums[i] == 3){
                return true;
            }
        }
        return false;
    }
}
