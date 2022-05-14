public class CountEvens {
    public static void main(String[] args) {
        int[] numsA = {2, 1, 2, 3, 4};
        System.out.println(countEvens(numsA));
    }

    public static int countEvens(int[] nums){
        int even = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                even++;
            }
        }
        return even;
    }
}
