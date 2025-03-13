import java.util.Scanner;

public class P1C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so thu nhat : ");
        int a = sc.nextInt();
        System.out.println("Moi ban nhap vao so thu hai : ");
        int b = sc.nextInt();
        tinhTong(a, b );


    }
    public static void tinhTong (int a , int b ) {
        int tong = a + b  ;
        System.out.println("Tổng 2 số là : " + tong);
    }
}
