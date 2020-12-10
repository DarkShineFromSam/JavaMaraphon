package day9.task2;

abstract class Figure {
    private String colour;
    private double area;

    public Figure(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public abstract double area();

    public abstract double perimeter();
}
