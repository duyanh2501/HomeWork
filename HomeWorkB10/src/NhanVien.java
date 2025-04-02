import java.util.Scanner;

abstract class NhanVien {
    protected String maNhanVien ;
    protected String hoTen ;
    protected int tuoi ;
    protected double luongCoBan ;


    public NhanVien(String maNhanVien, String hoTen, int tuoi, double luongCoBan) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.luongCoBan = luongCoBan;
    }

    public abstract double tinhLuong();

    public void hienThiThongTin () {
        System.out.println("Mã nhân viên : " + maNhanVien + ", Họ Tên : " + hoTen + " , Tuổi : " + tuoi + " , Lương cơ bản : " + luongCoBan );
    }

    public void nhapThongtin () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhâp mã sinh viên : " );
        this.maNhanVien = sc.nextLine();
        System.out.println("Mời bạn nhập họ tên :");
        this.hoTen = sc.nextLine();
        System.out.println("Mời bạn nhập tuổi : ");
        this.tuoi = sc.nextInt();
        System.out.println("Mời bạn nhập lương cơ bản : ");
        this.luongCoBan = sc.nextDouble();
    }
}
