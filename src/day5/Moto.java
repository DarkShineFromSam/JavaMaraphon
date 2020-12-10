package day5;

public class Moto {

    int year;
    String colour;
    String model;

    public Moto(int year, String colour, String model) {
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
}
