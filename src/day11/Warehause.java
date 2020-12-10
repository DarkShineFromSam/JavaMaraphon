package day11;

public class Warehause {
    private int balance;
    private int countOrder;

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Warehause{" +
                "balance=" + balance +
                ", countOrder=" + countOrder +
                '}';
    }
}
