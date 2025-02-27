import java.util.Scanner;
public class Bai4
{
    public static void main(String[] args) {
        System.out.println("------------MENU-----------");
        System.out.println("---------------------------");
        System.out.println("1.Giai phuong trinh bac nhat ");
        System.out.println("2.Giai phuong trinh bac hai ");
        System.out.println("3.Tinh tien dien  ");
        System.out.println("4.Ket thuc ");

        System.out.println("Moi ban chon chuc nang :");
        Scanner sc = new Scanner(System.in);
        int chucNang = sc.nextInt();

        if (chucNang >= 1 && chucNang <= 4 ) {
            switch (chucNang) {
                case 1 :

                    System.out.println("Moi ban nhap vao so a : ");
                    int a = sc.nextInt();
                    System.out.println("Moi ban nhap vao so b : ");
                    int b = sc.nextInt();

                    if ( a == 0 && b ==0 ){
                        System.out.println("Pt co vo so nghiem ");
                    }else if (a == 0 && b != 0 ) {
                        System.out.println("pt vo nghiem");
                    }else if ( a != 0){
                        double x = -b/a;
                        System.out.println("pt co nghiem x = " +x);
                        break;
                    }
                case 2 :

                    System.out.println("Moi ban nhap a : ");
                    a = sc.nextInt();
                    System.out.println("Moi ban nhap b : ");
                    b = sc.nextInt();
                    System.out.println("Moi ban nhap c : ");
                    int c = sc.nextInt();

                    double x1,x2 ;
                    double delta ;
                    delta = Math.pow(b , 2) - (4*a*c);

                    if (delta > 0  ){
                        x1 = (- b + Math.sqrt(delta)) / (2*a);
                        x2 = (- b - Math.sqrt(delta)) / (2*a);
                        System.out.println("pt co 2 nghiem ");
                        System.out.println("x1 = " + x1);
                        System.out.println("x2 = " + x2);
                    }else if (delta == 0 ) {
                        double x = -b / (2*a);
                        System.out.println("pt 1 co nghiem kep : " + x);
                    }else {
                        System.out.println("pt vo nghiem");
                        break;
                    }
                case 3 :

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
                        break;
                    }
                case 4 :
                    System.out.println("Ket thuc");
                    return;
            }
        }else {
            System.out.println("Error !");

        }

    }
}
