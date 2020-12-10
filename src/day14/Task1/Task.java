package day14.Task1;

import java.io.File;
import java.io.FileNotFoundException;

public class Task {
    public static void main(String[] args) throws FileNotFoundException {
    File file = new File("test");
    Sum.printSumDigit(file);

    }
}
