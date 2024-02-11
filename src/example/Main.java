package example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        System.out.println(Task1.tryDoingExs(array));

        Student student1 = new Student("Mike", 'm', 20, 7.8);
        Student student2 = new Student("Tom", 'm', 22, 8);
        Student student3 = new Student("Tim", 'm', 25, 9.5);
        Student student4 = new Student("Elena", 'f', 32, 6.8);
        Student student5 = new Student("Ann", 'f', 17, 8.3);
        Student student6 = new Student("Dima", 'm', 29, 9.9);

        List<Student> studentList = List.of(student1, student2, student3, student4, student5, student6);

        Student.sortStudents(studentList);

    }
}
