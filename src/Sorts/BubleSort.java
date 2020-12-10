package Sorts;

import java.util.Arrays;

public class BubleSort {
    public static void bubleSort (int [] array){
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            for (int k = 1; k < array.length; k++) {
                if (array[k] < array[k - 1]) {
                    // swap
                    Swap.swap(array, k, k - 1);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
