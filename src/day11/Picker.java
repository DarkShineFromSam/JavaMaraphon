package day11;

public class Picker implements Worker{
    private int solary;
    private Warehause warehause;


    public Picker(Warehause warehause) {
        this.warehause = warehause;
    }

    @Override
    public void doWork() {
        solary += 100;
        warehause.setCountOrder(warehause.getCountOrder() + 1);
    }

    @Override
    public void bonus() {
        if (warehause.getCountOrder() > 1500){
            solary *= 3;
        }
    }

    @Override
    public String toString() {
        return "Picker: " +
                "solary=" + solary;
    }
}
