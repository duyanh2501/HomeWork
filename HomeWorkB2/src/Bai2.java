import java.util.Scanner;
public class Bai2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap a : ");
        int a = sc.nextInt();
        System.out.println("Moi ban nhap b : ");
        int b = sc.nextInt();
        System.out.println("Moi ban nhap c : ");
        int c = sc.nextInt();

        double x1,x2 ;
        double delta ;
        delta = Math.pow(b , 2) - (4*a*c);

        if (delta > 0  ){
            x1 = (- b + Math.sqrt(delta)) / (2*a);
            x2 = (- b - Math.sqrt(delta)) / (2*a);
            System.out.println("pt co 2 nghiem ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }else if (delta == 0 ) {
            double x = -b / (2*a);
            System.out.println("pt 1 co nghiem kep : " + x);
        }else {
            System.out.println("pt vo nghiem");
        }
    }
}
