package example;

import java.util.List;

/*
1. Имена сделать заглавными буквами
2. Вывести только женщин
3. Отсортировать по возрасту
4. Вывести на экран

 */
public class Student {
    private String name;
    private char gender;
    private int age;
    private double avgGrade;

    public Student(String name, char gender, int age, double avgGrade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.avgGrade = avgGrade;
    }

    public static void sortStudents(List<Student> students) {
        students.stream().map(e ->
                {
                    e.setName(e.getName().toUpperCase());
                    return e;
                })
                .filter(e -> e.getGender() == 'f')
                .sorted((a, b) -> a.getAge() - b.getAge())
                .forEach(e -> System.out.println(e));
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
