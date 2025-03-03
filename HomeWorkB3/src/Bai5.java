import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("MOi ban nhap n duong : ");
        n = sc.nextInt();
        String nhiPhan = "  ";
        while (n > 0 ) {
            nhiPhan = (n % 2 ) + nhiPhan ;
            n = n / 2 ;
        }
        System.out.println("So nhi phan la : " + nhiPhan);
    }
}

