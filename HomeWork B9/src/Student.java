import java.util.ArrayList;

public class Student {
    private int id ;
    private String name ;
    private ArrayList<String> courses ;

    public Student(int id, String name ) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void registerCourse ( String courseName) throws CourseAlreadyRegisteredException {
        if(courses.contains(courseName)) {
            throw new CourseAlreadyRegisteredException(courseName);
        }
        courses.add(courseName);
        System.out.println(name + " has registered for course: " + courseName);
    }

    public void showInfor() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", Registered Courses: " + courses);
    }
}
