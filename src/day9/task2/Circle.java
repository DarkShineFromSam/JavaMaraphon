package day9.task2;

public class Circle extends Figure {
    public double r;
    public Circle(double r, String colour) {
        super(colour);
        this.r = r;
    }

    @Override
    public double area() {
        return Math.pow(r, 2) * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }
}
