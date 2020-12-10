package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setColour("Black");
        car.setModel("Audi");
        car.setYear(1999);

        System.out.println("Автомобиль: " + car.getModel() + ". Цвета: " + car.getColour() + "." + car.getYear() + " года выпуска." );
    }
}
