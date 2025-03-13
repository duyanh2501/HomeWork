import java.util.Scanner;

public class P2C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Moi ban nhap vao so nguyen : ");
        int a = sc.nextInt();

        if(a % 2 == 0 ) {
            System.out.println(a + " là số lẻ ");
        }else {
            System.out.println(a + "là số chẵn");
        }
    }
}
