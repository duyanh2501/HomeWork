import java.util.Scanner;

public class P2C3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Mời bạn nhập vào số chuyến đi  : ");
        int chuyenDi = sc.nextInt();

        int gia1ChuyenDi = 10000 ;
        double giaChuyenDi = chuyenDi * gia1ChuyenDi;

        if(chuyenDi > 5 ) {
            giaChuyenDi = giaChuyenDi * 0.9 ;
        }else if ( chuyenDi > 10 ) {
            giaChuyenDi = giaChuyenDi * 0.8 ;
        }
        System.out.println("Số tiền phải trả là : " + (int)giaChuyenDi);
    }
}
