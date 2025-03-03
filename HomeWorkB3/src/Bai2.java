import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MOi ban nhap n : 0");
        int n = sc.nextInt();

        int soDaonguoc = 0 ;
        while (n != 0 ) {
            int soCuoi = n % 10 ;
            soDaonguoc = soDaonguoc * 10 + soCuoi ;
            n = n / 10 ;
        }
        System.out.println("So dao nguoc la : " + soDaonguoc);
    }
}
