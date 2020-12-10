package Sorts;

import java.util.Arrays;

public class SelectionSort {
    public static void selection(int [] array){
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int k = i; k < array.length; k++) {
                if (array[k] < array[min]) {
                    min = k;
                }
            }
            Swap.swap(array,i,min);
        }
        System.out.println(Arrays.toString(array));
    }
}
