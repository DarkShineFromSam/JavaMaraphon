package day9.task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Mol","500");
        Teacher teacher = new Teacher("Ivan", "Fil");

        student.printInfo();
        teacher.printInfo();

        student.setName("Ula");
        student.setGroupName("501");

        teacher.setName("Van");
        teacher.setSubjectName("Math");


        String s = student.getGroupName();

        student.printInfo();
        teacher.printInfo();


        System.out.println(s);
    }
}
