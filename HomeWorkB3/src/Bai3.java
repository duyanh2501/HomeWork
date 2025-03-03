import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so nguyen duong :");
        int n = sc.nextInt();
        int giaiThua = 1   ;
        for(int i = 1 ; i <= n ; i++) {
            giaiThua = giaiThua * i   ;
        }
        System.out.println(n + " giai thua = " + giaiThua);
    }
}
