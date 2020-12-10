package day6;

public class Car {

    int year;
    String colour;
    String model;
    
    public Car(int year, String colour, String model){
        this.year = year;
        this.colour = colour;
        this.model = model;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifferent(int inputYear){
        return Math.abs(inputYear - year);
    }
}
