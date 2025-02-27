import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so dien: ");
        int soDien = sc.nextInt();

        if (soDien > 0 && soDien <= 50) {
            int tienDien = (soDien * 1678);
            System.out.println("So tien dien phai tra la: " + tienDien);
        } else if (soDien > 50 && soDien <= 100) {
            int tienDien = (50 * 1678) + (soDien - 50) * 1734;
            System.out.println("So tien dien phai tra la: " + tienDien);
        } else if (soDien > 100 && soDien <= 200) {
            int tienDien = (50 * 1678) + (50 * 1734) + (soDien - 100) * 2014;
            System.out.println("So tien dien phai tra la: " + tienDien);
        } else if (soDien > 200 && soDien <= 300) {
            int tienDien = (50 * 1678) + (50 * 1734) + (100 * 2014) + (soDien - 200) * 2536;
            System.out.println("So tien dien phai tra la: " + tienDien);
        } else if (soDien > 300 && soDien <= 400) {
            int tienDien = (50 * 1678) + (50 * 1734) + (100 * 2014) + (100 * 2536) + (soDien - 300) * 2834;
            System.out.println("So tien dien phai tra la: " + tienDien);
        } else {
            int tienDien = (50 * 1678) + (50 * 1734) + (100 * 2014) + (100 * 2536) + (100 * 2834) + (soDien - 400) * 2927;
            System.out.println("So tien dien phai tra la: " + tienDien);
        }
    }
}
