package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airp1 = new Airplane("Boing",2019,120,220);
        Airplane airp2 = new Airplane("Boing",2019,130,220);

        Airplane.compareAirplanes(airp1,airp2);
    }
}
