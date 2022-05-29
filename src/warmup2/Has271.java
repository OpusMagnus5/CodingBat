/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern:
a value, followed by the value plus 5, followed by the value minus 1.
Additionally the 271 counts even if the "1" differs by 2 or less from
the correct value.
*/

package warmup2;

public class Has271 {
    public static void main(String[] args) {
        System.out.println(has271(new int[]{2, 7, 3}));
        System.out.println(has271(new int[]{1, 2, 8, 1}));
        System.out.println(has271(new int[]{1, 7, 1}));
    }

    public static boolean has271(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++){
            if (nums[i] - nums[i - 1] == 5){
                if (nums[i - 1] - nums[i + 1] <= 3 &&
                nums[i - 1] - nums[i + 1] >= -1){
                    return true;
                }
            }
        }
        return false;
    }
}
