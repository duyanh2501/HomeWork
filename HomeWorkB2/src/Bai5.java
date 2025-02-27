import java.util.Scanner;
public class Bai5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap thang ");
        int thang = sc.nextInt();
        System.out.println("Moi ban nhap nam  ");
        int nam = sc.nextInt();

        switch (thang ) {
            case 1 , 3 , 5 , 7 ,8 , 10 , 12 :
                System.out.println("Thang " + thang + " co 31 ngay ");
                break;
            case 4, 6, 9, 11:
                System.out.println("Thang " + thang + " co 30 ngay ");
                break;

            case 2 :
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                    System.out.println("thang " + thang + " co 28 ngay ");
                } else {
                    System.out.println("thang " + thang + " co 29 ngay");
                }
                break;
            default :
                System.out.println("Error ! ");
        }
    }
}
