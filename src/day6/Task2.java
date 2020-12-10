package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing",2019,120,220);
        airplane.info();

        airplane.fillUp(20);
        airplane.info();

        airplane.setProducer("Ula");
        airplane.setYear(2010);
        airplane.setLength(60);
        airplane.setWeight(30);
        airplane.fillUp(120);

        airplane.info();
    }
}
