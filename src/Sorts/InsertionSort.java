package Sorts;

import java.math.BigInteger;
import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int [] array) {
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void insertion(int [] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++){
            for (int j = i; j > 0 && array[j-1]>array[j]; j--) {
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
