/*Return an array that contains the exact same numbers as the given array,
but rearranged so that all the even numbers come before all the odd numbers.
Other than that, the numbers can be in any order. You may modify and return
the given array, or make a new array.*/

public class EvenOdd {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 0, 1, };
        for(int element : evenOdd(nums)){
            System.out.print(element + " ");
        }
    }

    public static int[] evenOdd(int[] nums) {
        for (int i = 0, pivot = 0; i < nums.length; i++){
            int temp;
            if (nums[i] % 2 == 0){
                temp = nums[pivot];
                nums[pivot] = nums[i];
                nums[i] = temp;
                pivot++;
            }
        }
        return nums;
    }
}
