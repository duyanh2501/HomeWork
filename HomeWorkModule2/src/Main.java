import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Company company = new Company();

        while (true) {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Thêm nhân viên mới");
            System.out.println("2. Hiển thị tất cả nhân viên");
            System.out.println("3. Cập nhật lương nhân viên");
            System.out.println("4. Tìm và hiển thị lương nhân viên theo tên");
            System.out.println("5. Thêm phòng ban mới");
            System.out.println("6. Hiển thị các phòng ban");
            System.out.println("7. Sắp xếp nhân viên theo lương (giảm dần)");
            System.out.println("8. Tìm kiếm nhân viên theo tên");
            System.out.println("0. Thoát chương trình");
            System.out.print("Lựa chọn của bạn: ");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int age = sc.nextInt();
                    System.out.print("Nhập lương: ");
                    double salary = sc.nextDouble(); sc.nextLine();
                    System.out.print("Là quản lý? (y/n): ");
                    String isManager = sc.nextLine();

                    if (isManager.equalsIgnoreCase("y")) {
                        System.out.print("Nhập phòng ban: ");
                        String dept = sc.nextLine();
                        company.addEmployee(new Manager(name, age, salary, dept));
                    } else {
                        company.addEmployee(new Employee(name, age, salary));
                    }
                    break;

                case 2:
                    company.displayAllEmployees();
                    break;

                case 3:
                    System.out.print("Nhập tên nhân viên: ");
                    String n = sc.nextLine();
                    System.out.print("Nhập lương mới: ");
                    double newSal = sc.nextDouble(); sc.nextLine();
                    company.updateSalaryByName(n, newSal);
                    break;

                case 4:
                    System.out.print("Nhập tên nhân viên: ");
                    String nameSal = sc.nextLine();
                    company.findSalaryByName(nameSal);
                    break;

                case 5:
                    System.out.print("Nhập tên phòng ban: ");
                    String dept = sc.nextLine();
                    company.addDepartment(dept);
                    break;

                case 6:
                    company.displayDepartments();
                    break;

                case 7:
                    company.sortEmployeesBySalaryDesc();
                    company.displayAllEmployees();
                    break;

                case 8:
                    System.out.print("Nhập tên nhân viên cần tìm: ");
                    String nameSearch = sc.nextLine();
                    company.searchEmployeeByName(nameSearch);
                    break;

                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
            }
        }
    }
}
