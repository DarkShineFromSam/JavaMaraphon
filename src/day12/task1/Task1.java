package day12.task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> carsList = new ArrayList<>();

        carsList.add("BMW");
        carsList.add("Mersedes-Benz");
        carsList.add("Audi");
        carsList.add("Toyota");
        carsList.add("Kia");

        System.out.println(carsList);

        carsList.add(3,"Hundai");

        System.out.println(carsList);

        carsList.remove(0);

        System.out.println(carsList);

    }
}
