
import java.util.*;

class Course {

    int courseId;
    String courseName;

    Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    void display() {
        System.out.println(courseId + " " + courseName);
    }
}

class Student extends Course {

    int studentId;
    ArrayList<Course> courses;

    Student(int courseId, String courseName, int studentId) {
        super(courseId, courseName);
        this.studentId = studentId;
        courses = new ArrayList<>();
    }

    void addCourse(Course c) {
        courses.add(c);
    }

    void displayCourses() {
        for (Course c : courses) {
            System.out.println(c.courseId + " " + c.courseName);
        }
    }

    class Main {

        public static void main(String[] args) {
            Student s = new Student(101, "Ravi");

            s.addCourse(new Course(1, "Java"));
            s.addCourse(new Course(2, "DBMS"));
            s.addCourse(new Course(3, "Python"));

            s.displayCourses();
        }
    }

}
