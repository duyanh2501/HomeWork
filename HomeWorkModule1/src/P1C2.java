import java.util.Scanner;

import static java.lang.Math.PI;

public class P1C2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Mời bạn nhập bán kính đường tròn : ");
        double r = sc.nextDouble();

        double S = PI * r * r ;

        String kiemTra = (S % 2 == 0 ) ? "Là số chẵn " : " Là Số Lẻ ";
        System.out.println("Diên tích hình tròn là " + S + kiemTra );

    }
}
