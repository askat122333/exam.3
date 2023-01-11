package Third;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
           students.add(Student.add());
        }
        System.out.println(students);
        System.out.println("______________________________");
        Student.delete(students);
        System.out.println("______________________________");
        System.out.println(students);
        System.out.println("______________________________");
        Student.printStudents(students,3);

    }
}
