import java.util.*;

public class QuanLyImpl implements IQuanLy{

    private List<NhanVien> danhSachNhanVien = new ArrayList<>();


    @Override
    public void khoiTaoNhanVienMacDinh() {
        danhSachNhanVien.add(new NhanVienVanPhong("01" , " Đào Duy Anh " , 25 , 100000 , 26));
        danhSachNhanVien.add(new NhanVienVanPhong("02" , " Lê Mỹ Huyền " , 23 , 300000 , 10));
        danhSachNhanVien.add(new NhanVienVanPhong("03" , " Lê Foxxy " , 03 , 1000 , 30));
    }

    @Override
    public void themNhanVien() throws EmployeeException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma NV: ");
        String maNV= sc.nextLine();

        for (NhanVien nv : danhSachNhanVien) {
            if (nv.maNhanVien.equals(maNV)) {
                throw new EmployeeException("Ma nhan vien da ton tai!");
            }
        }
        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        int tuoi = sc.nextInt();
        System.out.print("Nhap luong co ban: ");
        double luongCoBan = sc.nextDouble();

        System.out.println("Chon loai nhan vien: 1-Van phong, 2-Ky su, 3-Quan ly");
        int loai = sc.nextInt();
        sc.nextLine();

        switch (loai) {
            case 1:
                System.out.print("Nhap so ngay lam viec: ");
                int soNgayLamViec = sc.nextInt();
                danhSachNhanVien.add(new NhanVienVanPhong(maNV, hoTen, tuoi, luongCoBan, soNgayLamViec));
                break;
            case 2:
                System.out.print("Nhap chuyen mon: ");
                String chuyenMon = sc.nextLine();
                danhSachNhanVien.add(new KySu(maNV, hoTen, tuoi, luongCoBan, chuyenMon));
                break;
            case 3:
                System.out.print("Nhap he so chuc vu: ");
                double heSoChucVu = sc.nextDouble();
                danhSachNhanVien.add(new QuanLy(maNV, hoTen, tuoi, luongCoBan, heSoChucVu));
                break;
            default:
                System.out.println("Loai nhan vien khong hop le!");
        }
    }

    @Override
    public void hienThiDanhSach() {
        for (NhanVien nv : danhSachNhanVien) {
            nv.hienThiThongTin();
        }
    }

    @Override
    public double tinhTongLuong() {
        double tong = 0 ;
        for(NhanVien nv : danhSachNhanVien) {
            tong += nv.tinhLuong();
        }
        return tong;
    }

    @Override
    public void timLuongCaoNhat() {
        NhanVien maxNV = Collections.max(danhSachNhanVien, Comparator.comparingDouble(NhanVien::tinhLuong));
        maxNV.hienThiThongTin();
    }

    @Override
    public void timTheoMaNV() {
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.maNhanVien.equals(nv.maNhanVien)) {
                nv.hienThiThongTin();
                return;
            }
        }
        System.out.println("Khong tim thay nhan vien ");

    }

    @Override
    public void sapXepTheoTen() {
        danhSachNhanVien.sort(Comparator.comparing(nv -> nv.hoTen));
    }

    @Override
    public void sapXepTheoLuongGiamDan() {
        danhSachNhanVien.sort((nv1, nv2) -> Double.compare(nv2.tinhLuong(), nv1.tinhLuong()));

    }
}
