public class CourseAlreadyRegisteredException extends Exception {
    public CourseAlreadyRegisteredException(String courseName) {
        super("Student has already registered for course: " + courseName);
    }
}