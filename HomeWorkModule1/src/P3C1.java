import java.util.Scanner;

public class P3C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Mời bạn nhập vào chuỗi : ");
        String chuoi = sc.nextLine();

        StringBuilder daoNguocChuoi = new StringBuilder(chuoi);
        daoNguocChuoi.reverse();

        System.out.println("Chuỗi đảo ngược: " + daoNguocChuoi.toString());

    }
}
