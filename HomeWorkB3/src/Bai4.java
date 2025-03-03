import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tong = 200000 ;
        for(int x = 1 ; x <= 200 ; x++ ){
            for(int y = 1 ; y <= 100 ; y++){
                for(int z = 1 ; z <= 40 ; z++) {
                    if((x * 1000 ) + (y * 2000 ) + (z * 5000) == tong ) {
                        System.out.println("so to 1000 : " + x + ", so to 2000 : " + y + ", so to 5000 : " + z );
                    }
                }
            }
        }


    }
}
