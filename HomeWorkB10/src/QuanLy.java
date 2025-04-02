public class QuanLy extends NhanVien{

    private double heSoChucVu;


    public QuanLy(String maNhanVien, String hoTen, int tuoi, double luongCoBan, double heSoChucVu) {
        super(maNhanVien, hoTen, tuoi, luongCoBan);
        this.heSoChucVu = heSoChucVu;
    }


    @Override
    public double tinhLuong() {
        return luongCoBan * heSoChucVu;
    }
}
