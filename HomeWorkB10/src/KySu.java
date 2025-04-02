public class KySu extends NhanVien{

    private String chuyenMon;

    public KySu(String maNhanVien, String hoTen, int tuoi, double luongCoBan, String chuyenMon) {
        super(maNhanVien, hoTen, tuoi, luongCoBan);
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + 2000000;
    }


}
