import java.util.regex.*;
public class Bai2 {

    public static void main(String[] args) {
        String[] soDienThoaiList = {
                "+84123456789",  // ✅ Hợp lệ
                "84123456789",   // ✅ Hợp lệ
                "0123456789",    // ✅ Hợp lệ
                "0xxx.xxx.xxx",  // ✅ Hợp lệ
                "0xxx-xxx-xxx",  // ✅ Hợp lệ
                "012345678",     // ❌ Không hợp lệ (chỉ có 8 số)
                "+841234567",    // ❌ Không hợp lệ (thiếu chữ số)
                "84123-45678",   // ❌ Không hợp lệ (sai định dạng)
                "0xx-xx--xxxx",  // ❌ Không hợp lệ (dấu "-" sai)
                "+84.123.456.78a" // ❌ Không hợp lệ (chứa ký tự không phải số)
        };
        for (String soDienThoai : soDienThoaiList) {
            System.out.println("Số điện thoại: " + soDienThoai + " → " +
                    (kiemTraSoDienThoai(soDienThoai) ? "Hợp lệ ✅" : "Không hợp lệ ❌"));
        }

    }
    public static boolean kiemTraSoDienThoai(String soDienThoai) {
        // Biểu thức chính quy để kiểm tra số điện thoại hợp lệ
        String regex = "^(\\+84|84|0)\\d{3}[-.]?\\d{3}[-.]?\\d{3}$";

        // Kiểm tra với regex
         return soDienThoai.matches(regex);
    }
}
