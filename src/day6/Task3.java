package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Аблокулов Улугбек Уктамович", "Программирование");
        Student student = new Student("Аблокулов Дамир");

        teacher.evaluate(student);
    }
}
