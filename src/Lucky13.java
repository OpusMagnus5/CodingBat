public class Lucky13 {
    public static void main(String[] args) {
        int[] numsC = {0, 2, 4};
        System.out.println(lucky13(numsC));
    }

    public static boolean lucky13(int[] nums){
        for(int element : nums){
            if(element == 1 || element == 3){
                return false;
            }
        }
        return true;
    }
}
