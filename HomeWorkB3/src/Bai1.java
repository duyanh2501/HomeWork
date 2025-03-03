import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        do{
            System.out.println("Moi ban nhap vao n : ");
            n = sc.nextInt();
        } while (n <= 0 );

        double tong = 0 ;
        for(int i = 1 ; i <= n ; i++) {
            tong = tong + Math.pow(i , 3 );
            System.out.println("Cac day so lap phuong la : " +  Math.pow(i ,3 ));
        }
        System.out.println("Tong day so la : " + tong );

    }
}
