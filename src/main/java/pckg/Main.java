package pckg;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Pasha", "IVT-2"));
        students.add(new Student("Masha", "IVT-2"));
        students.add(new Student("Sasha", "IVT-2"));
        //

        Student.printStudents(students, 1);

        Student.selectionForNextCourse(students);

        Student.printStudents(students, 2);
    }
}
