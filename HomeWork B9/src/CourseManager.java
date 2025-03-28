import java.util.ArrayList;

public class CourseManager {
    private ArrayList<Student> students ;

    public CourseManager() {
        students = new ArrayList<>();
    }

    public void addStudent (Student student) {
        students.add(student);
    }


    public void registerStudentForCourse(Student student, String courseName) {
        try {
            student.registerCourse(courseName);
        } catch (CourseAlreadyRegisteredException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Course registration process completed.");
        }
    }
}

