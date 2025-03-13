import java.util.Scanner;

public class P3C3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Mời bạn nhập vào 1 chuỗi : " );
        String chuoi = sc.nextLine();

        boolean chuoiPalindrome = true ;

        for (int i =0 ; i < chuoi.length() / 2 ; i++) {
            if  (Character.toLowerCase(chuoi.charAt(i)) != Character.toLowerCase(chuoi.charAt(chuoi.length() -1 -i))){
                chuoiPalindrome = false;
                break;
            }
        }
        if(chuoiPalindrome) {
            System.out.println("Là chuoi Palindrome ");
        }else {
            System.out.println("Khong phai la chuoi Palindrome ");
        }
    }
}
