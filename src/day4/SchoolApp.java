package day4;

public class SchoolApp {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "A";
        student1.age = 12;
        student1.studentClass = 6;
        student1.rollNumber = 1;
        student1.takeLeave();

        Teacher teacher1 = new Teacher();
        teacher1.name = "B";
        teacher1.age = 30;
        teacher1.subject = "Computer";
        teacher1.takeLeave();
    }
}
