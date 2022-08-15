package day4;

public class SchoolApp {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("A");
        student1.setAge(10);
        student1.setStudentClass(5);
        student1.setRollNumber(2);
        student1.setSelected(true);


        System.out.println(student1.getName());
        System.out.println(student1.getRollNumber());
        System.out.println(student1.isSelected());
        System.out.println(student1.getAge());
        System.out.println(student1);


        Teacher teacher1 = new Teacher();

        //int = 0
        //long = 0
        //short = 0
        //byte = 0
        //double = 0.0
        //float = 0.0
        // boolean = false
        // char = ''

        // String = null

    }
}
