package day14.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sum {
    public static void printSumDigit(File file) throws FileNotFoundException {

        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String [] numberString = line.split(" ");

            if (numberString.length != 10)
                throw new IllegalArgumentException();

            int sum = 0;

            for (String number: numberString)
                sum = sum + Integer.parseInt(number);

            System.out.println(sum);

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл.");
        }
    }
}
