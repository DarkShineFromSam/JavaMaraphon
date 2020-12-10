package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehause warehause1 = new Warehause();
        Picker picker1 = new Picker(warehause1);
        Courier courier1 = new Courier(warehause1);

        Picker picker = new Picker(warehause1);
        Courier courier = new Courier(warehause1);

        System.out.println(warehause1 + " " + picker1 + " " + courier1);
        System.out.println(warehause1 + " " + picker + " " + courier);

        for (int i = 1; i <= 1501; i++){
            picker1.doWork();
            courier1.doWork();
        }
        picker1.bonus();
        courier1.bonus();
        System.out.println(warehause1 + "\n" + picker1 + "\n" + courier1);
        System.out.println(warehause1 + " " + picker + " " + courier);
    }
}
