public class Employee implements Workable{
    public String name;
    public int age;
    public double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        work();
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }

    @Override
    public void work() {
        System.out.println(name + " is working as an employee");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void updateSalary( double newSalary) {
        if(newSalary < 0 ) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }

        this.salary = newSalary;
    }

}
