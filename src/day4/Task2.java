package day4;

import java.util.Arrays;
import java.util.Random;

/* Создать новый массив размера 100 и заполнить его случайными числами из
 *диапазона от 0 до 10000.
 *Затем, используя циклы for each вывести:
 *- наибольший элемент массива
 *- наименьший элемент массива
 *- количество элементов массива, оканчивающихся на 0
 *- сумму элементов массива, оканчивающихся на 0
 */

public class Task2 {
    public static void main(String[] args) {
        int [] array = new int[100];
        int min = 10000;
        int max = 0;
        int zero = 0;
        int sum = 0;

        Random random = new Random();


        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        for (int element : array) {
            if (element > max)
                max = element;
        }
        for (int element: array) {
            if (element < min)
                min = element;
        }
        for (int element : array) {
            if (element % 10 == 0) {
                zero++;
                sum += element;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(max);
        System.out.println(min);
        System.out.println(zero);
        System.out.println(sum);

    }
}
