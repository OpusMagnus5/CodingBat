/*Given an array of ints, we'll say that a triple is a value appearing 3 times
in a row in the array. Return true if the array does not contain any triples.*/

package warmup2;

public class NoTriples {
    public static void main(String[] args) {
        System.out.println(noTriples(new int[]{1, 1, 1}));
        System.out.println(noTriples(new int[]{1, 1, 2, 2, 2, 1}));
        System.out.println(noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
    }

    public static boolean noTriples(int[] nums) {
        int counterAppears = 0;
        for (int i = 1; i < nums.length; i++){
            if (nums[i - 1] == nums[i]){
                counterAppears++;
            }else {
                counterAppears = 0;
            }
            if (counterAppears == 2){
                return false;
            }
        }
        return true;
    }
}
