package day8;

public class Airplane {

    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void info(){
        System.out.println("\"" + producer + "\" " + year+", " + length + ", "+ weight +", " + fuel);
    }
    public void fillUp(int inputFuel){
        fuel += inputFuel;
    }

    @Override
    public String toString() {
        return "\"" + producer + "\" " + year+", " + length + ", "+ weight +", " + fuel;
    }
}
