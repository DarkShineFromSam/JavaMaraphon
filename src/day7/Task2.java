package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(98);
        Player player2 = new Player(90);
        Player player3 = new Player(95);
        Player.info();
        Player player4 = new Player(90);
        Player player5 = new Player(97);
        Player player6 = new Player(100);

        Player.info();
        for (int i = 0; i < 99; i++){
        player1.run();
        }
        Player.info();




    }
}
