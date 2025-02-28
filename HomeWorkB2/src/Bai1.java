import java.util.Scanner;
public class Bai1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so a : ");
        int a = sc.nextInt();
        System.out.println("Moi ban nhap vao so b : ");
        int b = sc.nextInt();

        if ( a == 0 && b ==0 ){
            System.out.println("Pt co vo so nghiem ");
        }else if (a == 0 && b != 0 ) {
            System.out.println("pt vo nghiem");
        }else if ( a != 0){
            double x = -b/a;
            System.out.println("pt co nghiem x = " +x);
        }

    }
}

 // TEST COMMIT
