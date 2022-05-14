/*Return an array that contains the exact same numbers as the given array,
but rearranged so that all the zeros are grouped at the start of the array.
The order of the non-zero numbers does not matter.
So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given
array or make a new array.*/

public class ZeroFront {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 0, 1};
        for (int element : zeroFront(nums)){
            System.out.print(element + " ");
        }
    }

    public static int[] zeroFront(int[] nums) {
        for (int i = 0, pivot = 0; i < nums.length; i++){
            int temp;
            if (nums[i] == 0){
                temp = nums[pivot];
                nums[pivot] = nums[i];
                nums[i] = temp;
                pivot++;
            }
        }
        return nums;
    }
}
