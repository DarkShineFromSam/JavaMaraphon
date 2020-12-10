package day5;

public class Task2 {
    public static void main(String[] args) {

        Moto moto = new Moto(15, "Черный", "BMW");
        moto.setYear(2005);
        System.out.println(moto.getYear() + moto.getColour() + moto.getModel());
    }

}
