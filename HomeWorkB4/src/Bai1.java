public class Bai1 {
    public static void main(String[] args) {
        String vanBan ="Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do James Gosling khởi xướng và phát hành vào năm 1995. Phiên bản mới nhất của Java Standard Edition là Java SE 8. Với sự tiến bộ của Java và sự phổ biến rộng rãi của nó, nhiều cấu hình đã được xây dựng để phù hợp với nhiều loại nền tảng khác nhau. Ví dụ: J2EE cho các ứng dụng doanh nghiệp, J2ME cho các ứng dụng di động.";
        demSoLuongTungTu(vanBan);
        vietHoaChuCaiDauTien(vanBan);
        xoaNguyenAm(vanBan);

    }

    public static void demSoLuongTungTu(String vanBan) {
        vanBan = vanBan.toLowerCase().replaceAll("[^a-zA-Zàáạảãâầấậẩẫăằắặẳẵèéẹẻẽêềếệểễìíịỉĩòóọỏõôồốộổỗơờớợởỡùúụủũưừứựửữỳýỵỷỹđ ]", " ").trim();
        String[] arr = vanBan.split("\\s+");
        boolean [] daDem = new boolean[arr.length];

        for(int i = 0 ; i < arr.length ; i++) {
            if (daDem[i]) {
                continue;
            }
            int dem = 1 ;
            for ( int j = i + 1 ; j < arr.length ; j++) {
                if(arr[i].equals(arr[j])) {
                    dem++;
                    daDem[j] = true;

                }
            }
            System.out.println("Từ ( "+ arr[i] + " ) xuất hiện " + dem + " lần ");
        }
    }

    public static void vietHoaChuCaiDauTien(String vanBan) {
        String[] words = vanBan.split("\\s+");
        StringBuilder Stringnew = new StringBuilder();

        for(String word : words) {
            if(!word.isEmpty()) {
                Stringnew.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }
       vanBan = vanBan.trim();
        System.out.println("Dãy sau khi viết hoa là : " );
        System.out.print( Stringnew);
    }

    public static void xoaNguyenAm(String vanBan) {
        String ketQua = vanBan.replaceAll("[aeiouAEIOUáàảãạăắằẳẵặâấầẩẫậéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵ]", "");
        System.out.println("Chuỗi sau khi xóa nguyên âm " );
        System.out.print(ketQua);
    }

}
