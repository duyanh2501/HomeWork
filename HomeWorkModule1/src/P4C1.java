
import java.util.Arrays;
import java.util.Scanner;

public class P4C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Moi ban nhap so luong phan tu : ");
        int n =  sc.nextInt();

        int[] mang = new int[n];
        int tong = 0 ;
        for(int i = 0 ; i < n ; i++){
            System.out.println("Phan tu thu " + ( i + 1 ) + " : ");
            mang[i] = sc.nextInt();
             tong = tong + i ;
        }
        System.out.println("Tong pt trong mang la " + tong) ;

        int max = mang[0];
        int min = mang[0];

        for (int i = 0 ; i < n ; i++) {
            if(mang[i] > max) {
                max = mang[i];
            }else if (mang[i] < min ) {
                min =  mang[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min );

        System.out.println("Mang ban dau " + Arrays.toString(mang));

        System.out.println("nhap phan tu can them :");
        int ptThem = sc.nextInt();
        System.out.println("Nhap vi tri cho phan tu : ");
        int viTri = sc.nextInt();

        int [] mangMoi = new int[mang.length +1 ] ;
        int j = 0 ;
        for(int i = 0 ; i < mangMoi.length ; i++ ) {
            if(i == viTri) {
                mangMoi[i] = ptThem;
            }else {
                mangMoi[i] = mang[j];
                j++;
            }
        }
        mang = mangMoi;
        System.out.println("Mảng mới là " + Arrays.toString(mang));

        System.out.println("Nhap pt can xoa :");
        int ptXoa = sc.nextInt();
        int demPtXoa = 0;
        for (int num : mang) {
            if (num == ptXoa) {
                demPtXoa++;
            }
        }
            int [] mangMoi1 = new int[mang.length - demPtXoa];

            for(int i = 0 ; i < mang.length ; i++) {
                if(mangMoi[i] != ptXoa ) {
                     j = 0 ;
                    mangMoi1[j] = mangMoi[i];
                    j++;
                }
            }
            mangMoi = mangMoi1;
            System.out.println("Mang sau khi xoa : " + Arrays.toString(mangMoi));



    }

}
