package pckg;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Student {
    private String name;
    private String group;
    private int course = 1;

    private static final int numberOfSubjects = 5;
    private int[] marks = new int[numberOfSubjects];

    public Student(String name, String group) {
        this.name = name;
        this.group = group;

        for (int i = 0; i < marks.length; i++) {
            Random random = new Random();
            marks[i] = random.nextInt(5);
            marks[i]++;
        }
    }

    public float getAverageMark() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        return sum / marks.length;
    }

    public static void selectionForNextCourse(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student item = iterator.next();
            if (item.getAverageMark() < 3) {
                students.remove(item);
            } else {
                item.course++;
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("There are students from " + course + " course");
        for (Student s : students) {
            if (s.course == course) {
                System.out.println(s.name);
            }
        }
    }
}
