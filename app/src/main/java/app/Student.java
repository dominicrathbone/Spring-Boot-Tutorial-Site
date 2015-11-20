package app;

public class Student {

    String name;
    int studentNumber;
    String course;
    int courseYear;

    public Student(String name, int studentNumber, String course, int courseYear) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.course = course;
        this.courseYear = courseYear;

    }

    public String getName() {
        return name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getCourse() {
        return course;
    }

    public int getCourseYear() {
        return courseYear;
    }

}
