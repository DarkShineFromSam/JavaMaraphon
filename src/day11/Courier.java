package day11;

public class Courier implements Worker{
    private int solary;
    private Warehause warehause;

    public Courier(Warehause warehause) {
        this.warehause = warehause;
    }

    @Override
    public void doWork() {
        solary += 80;
        warehause.setBalance(warehause.getBalance() + 1000);
    }

    @Override
    public void bonus() {
        if (warehause.getBalance() > 1_000_000){
            solary *= 2;
        }
    }

    @Override
    public String toString() {
        return "Courier: " +
                "solary=" + solary;
    }
}
