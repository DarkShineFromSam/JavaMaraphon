package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();

        int counter8 = 0;
        int counter1 = 0;
        int counterEven = 0;
        int counterOdd = 0;
        int sum = 0;

        Random random = new Random();
        int [] array = new int[arrayLength];

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
            if(array[i] > 8)
                counter8++;
            if (array[i] == 1)
                counter1++;
            if (array[i]%2 == 0)
                counterEven++;
            if (array[i]%2!=0)
                counterOdd++;
            sum += array[i];
            System.out.print(array[i]);

        }
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);

        System.out.println(counter8);
        System.out.println(counter1);
        System.out.println(counterEven);
        System.out.println(counterOdd);
        System.out.println(sum);
    }
}
