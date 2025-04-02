public class NhanVienVanPhong extends NhanVien{
    private int soNgayLamViec ;

    public NhanVienVanPhong(String maNhanVien, String hoTen, int tuoi, double luongCoBan, int soNgayLamViec) {
        super(maNhanVien, hoTen, tuoi, luongCoBan);
        this.soNgayLamViec = soNgayLamViec;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + soNgayLamViec * 100000;
    }



}
