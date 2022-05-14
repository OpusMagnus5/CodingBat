/*Given n>=0, create an array length n*n with the following pattern, shown here
for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).*/

import java.util.Arrays;

public class SquareUP {
    public static void main(String[] args) {
        for(int element : squareUp(3)){
            System.out.print(element + " ");
        }
    }

    public static int[] squareUp(int n) {
        int[] tab = new int[n * n];
        Arrays.fill(tab, 0);
        for (int i = tab.length - 1, value = 1, nRepeats = 0; i >= 0; i--){
            tab[i] = value;
            value++;
            if(value > n - nRepeats){
                nRepeats++;
                value = 1;
                i = (tab.length - n * nRepeats);
            }
        }
        return tab;
    }
}
