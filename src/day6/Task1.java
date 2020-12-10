package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car(1991,"black","toyota");
        Moto moto = new Moto(1991, "black", "kawasaki");

        car.info();
        moto.info();

        System.out.println(car.yearDifferent(1900));
        System.out.println(moto.yearDifference(2020));
    }
}
