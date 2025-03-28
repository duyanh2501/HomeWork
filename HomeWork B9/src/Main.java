public class Main {
    public static void main(String[] args) {
        CourseManager courseManager = new CourseManager();

        Student student1 = new Student(1, "John Doe");
        Student student2 = new Student(2, "Jane Smith");

        courseManager.addStudent(student1);
        courseManager.addStudent(student2);

        courseManager.registerStudentForCourse(student1, "Math");
        courseManager.registerStudentForCourse(student1, "English");
        courseManager.registerStudentForCourse(student1, "Math"); // Duplicate course, should throw exception

        student1.showInfor();
        student2.showInfor();
    }
}