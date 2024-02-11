package example;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String nameOfFaculty;
    private List<Student> studentList;

    public Faculty(String nameOfFaculty) {
        this.nameOfFaculty = nameOfFaculty;
        studentList = new ArrayList<>();
    }

    public void addStudentToFaculty(Student student) {
        studentList.add(student);
    }

    public String getNameOfFaculty() {
        return nameOfFaculty;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
