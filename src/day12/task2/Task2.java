package day12.task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> even = new ArrayList<>();
        List<Integer> even1 = new ArrayList<>();
        for (int i = 0; i < 30; i++){
            if(i%2 == 0){
                even.add(i);
            }
        }
        System.out.println(even);

        for (int i = 300; i < 350; i++){
            if (i%2 == 0){
                even1.add(i);
            }
        }
        System.out.println(even1);
    }
}
