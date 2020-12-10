package day7;

public class Player {
    private int stamina;

    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int cointPlayers = 0;

    public Player(int stamina){
        this.stamina = stamina;
        if (cointPlayers < 6) {
            cointPlayers++;
        }
    }

    public void run(){
        if (stamina == 0){
            return;
        }
        stamina--;

        if (stamina == 0){
            cointPlayers--;
        }
    }

    public static void info(){
        if (cointPlayers < 6){
            System.out.println("Команды не полные. На поле есть " + (6 - cointPlayers) + " мест.");
        } else {
            System.out.println("На поле нет свободных мест.");
        }

    }
}
