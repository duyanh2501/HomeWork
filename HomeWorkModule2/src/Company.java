import java.util.* ;
public class Company {
    private List<Employee> employees;
    private Map<String, Double> salaryMap;
    private Set<String> departments;

    public Company() {
        employees = new ArrayList<>();
        salaryMap = new HashMap<>();
        departments = new HashSet<>();

        Employee e1 = new Employee("An", 25, 6000);
        Manager m1 = new Manager("Binh", 35, 9500, "IT");
        Manager m2 = new Manager("Chi", 40, 11000, "HR");

        employees.add(e1);
        employees.add(m1);
        employees.add(m2);

        salaryMap.put(e1.getName(), e1.getSalary());
        salaryMap.put(m1.getName(), m1.getSalary());
        salaryMap.put(m2.getName(), m2.getSalary());

        departments.add(m1.getDepartment());
        departments.add(m2.getDepartment());
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
        salaryMap.put(emp.getName(), emp.getSalary());
        if (emp instanceof Manager) {
            departments.add(((Manager) emp).getDepartment());
        }
        System.out.println("Thêm nhân viên thành công.");
    }

    // Hiển thị danh sách nhân viên
    public void displayAllEmployees() {
        System.out.println("=== Danh sách nhân viên ===");
        for (Employee e : employees) {
            e.displayInfo();
            System.out.println();
        }
    }

    // Thêm hoặc cập nhật lương
    public void updateSalaryByName(String name, double newSalary) {
        for (Employee e : employees) {
            if (e.getName().equalsIgnoreCase(name)) {
                try {
                    e.updateSalary(newSalary);
                    salaryMap.put(name, newSalary);
                    System.out.println("Lương đã được cập nhật.");
                } catch (IllegalArgumentException ex) {
                    System.out.println("Lỗi: " + ex.getMessage());
                }
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên.");
    }

    // Tìm và hiển thị lương theo tên
    public void findSalaryByName(String name) {
        if (salaryMap.containsKey(name)) {
            System.out.println("Lương của " + name + ": " + salaryMap.get(name));
        } else {
            System.out.println("Không tìm thấy nhân viên.");
        }
    }

    // Thêm phòng ban
    public void addDepartment(String dept) {
        if (departments.add(dept)) {
            System.out.println("Phòng ban đã được thêm.");
        } else {
            System.out.println("Phòng ban đã tồn tại.");
        }
    }

    // Hiển thị các phòng ban
    public void displayDepartments() {
        System.out.println("=== Danh sách phòng ban ===");
        for (String d : departments) {
            System.out.println("- " + d);
        }
    }

    // Sắp xếp nhân viên theo lương giảm dần
    public void sortEmployeesBySalaryDesc() {
        employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        System.out.println("Danh sách nhân viên đã được sắp xếp theo lương giảm dần.");
    }

    // Tìm nhân viên theo tên
    public void searchEmployeeByName(String name) {
        for (Employee e : employees) {
            if (e.getName().equalsIgnoreCase(name)) {
                System.out.println("Thông tin nhân viên:");
                e.displayInfo();
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên.");
    }
}

